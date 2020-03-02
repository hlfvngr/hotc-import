package com.hgits.hotc.web.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hgits.hotc.common.properties.HotcProperties;
import com.hgits.hotc.entity.*;
import com.hgits.hotc.entity.enums.ImportResult;
import com.hgits.hotc.entity.enums.Summation;
import com.hgits.hotc.entity.vo.ApiResult;
import com.hgits.hotc.service.ImportService;
import com.hgits.hotc.service.LogService;
import com.hgits.hotc.utils.BeanUtils;
import com.hgits.hotc.utils.FileUtils;
import com.hgits.hotc.utils.ZipUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@Slf4j
@Controller
@RequestMapping("/api/v1/import")
public class ImportController {

    private static final Map<String, Class<?>> fileName2EntityMap = new HashMap<>();

    static {
        fileName2EntityMap.put("DataPointSum", DataPointSumSend.class);
        fileName2EntityMap.put("EnPass", EnPassSend.class);
        fileName2EntityMap.put("ExEtcTrans", ExEtcTransSend.class);
        fileName2EntityMap.put("ExPass", ExPassSend.class);
        fileName2EntityMap.put("GantryCount", GantryCountSend.class);
        fileName2EntityMap.put("GantryTrans", GantryTransSend.class);
        fileName2EntityMap.put("LaneEnCount", LaneEnCountSend.class);
        fileName2EntityMap.put("LaneExCount", LaneExCountSend.class);
        fileName2EntityMap.put("LaneShift", LaneShiftSend.class);
        fileName2EntityMap.put("OtherTrans", OtherTransSend.class);
        fileName2EntityMap.put("VehIdImageOnDemand", VehIdImageOnDemandSend.class);
        fileName2EntityMap.put("VehIdInfo", VehIdInfoSend.class);
    }

    @Resource
    HotcProperties hotcProperties;

    @Resource
    LogService logService;

    @Resource
    ImportService importService;

    @PostMapping("/logs")
    public ApiResult selectImportLogs(@RequestParam("pageNum") Integer pageNum,
                                      @RequestParam("pageSize") Integer pageSize) {
        Page<Log> page = new Page<>(pageNum, pageSize);
        PageInfo<Log> logs = logService.listByPage(page);
        return ApiResult.builder().code(0).data(logs).build();
    }

    @PostMapping("/persist")
    public ApiResult importFlowAboutNaturalSum(@RequestParam("file") MultipartFile file) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //一. 读取文件名，然后进行文件名校验及MD5码校验
        //二. 读取压缩包中文件的内容，将每种类型的文件进行插库   完成
        //三. 在插库操作中，保证事务性，若中间有插入失败，则回滚，返回插入失败 完成
        String originalFilename = file.getOriginalFilename();
        String fileNameNoEx = FileUtils.getFileNameNoEx(originalFilename);

        //1. 校验文件的MD5码
        Log aLog = getLog(originalFilename);

        InputStream inputStream = file.getInputStream();

        String tmpDir = hotcProperties.getTmpDir();
        String parent = tmpDir + File.separator + fileNameNoEx;

        //2. 将压缩文件解压到指定目录
        ZipUtils.unzip(parent, inputStream);

        //3. 从指定目录提取文件
        List<File> files = FileUtils.getFilesFrom(parent);

        //4. 将文件转化成相应的实体类
        if(files == null)
            return ApiResult.builder().code(0).msg("插入成功").build();

        Map<Class<?>, List<?>> entityListMap = new HashMap<>();

        for (File f : files) {
            Class<?> aClass = getClass(f);
            List<?> objects = BeanUtils.transferTo(f, aClass);
            entityListMap.put(aClass, objects);
        }

        //5. 尝试将解压缩的文件进行入库
        try {
            importService.saveData(entityListMap);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("发生异常：{}", e.getMessage());
            aLog.setResult(ImportResult.FAIL.getCode());
            return ApiResult.builder().code(1).msg("插入失败").build();
        } finally {
        //6. 插入日志
            logService.insert(aLog);

        //7. 删除解析文件
            FileUtils.deleteDirectory(new File(parent));
        }

        return ApiResult.builder().code(0).msg("插入成功").build();
    }

    private Log getLog(String originalFilename) {
        // fotc_naturalsum_4401_2402_7_91F3FE105B41CEE5880D747C72C8BA92_20200301
        String[] splits = originalFilename.split("_");
        Integer sumType = Summation.SQUAD.getDesc().equals(splits[1])
                ? Summation.SQUAD.getCode() : Summation.NATURAL.getCode();

        Log log = new Log();

        log.setId(UUID.randomUUID().toString().replaceAll("-",""))
            .setFileName(originalFilename)
            .setSumType(sumType)
            .setImportTime(new Date())
            .setResult(ImportResult.SUCCESS.getCode());
        return log;
    }

    private Class<?> getClass(File file) {
        String fileName = file.getName();
        int i = fileName.indexOf('_');
        String key = fileName.substring(i + 1, fileName.indexOf('_', i + 1));
        return fileName2EntityMap.get(key);
    }

}
