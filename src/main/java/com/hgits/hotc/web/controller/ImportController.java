package com.hgits.hotc.web.controller;

import com.hgits.hotc.common.properties.HotcProperties;
import com.hgits.hotc.entity.*;
import com.hgits.hotc.entity.vo.ApiResult;
import com.hgits.hotc.service.impl.ImportService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    ImportService importService;

    @PostMapping("/logs")
    public ApiResult selectImportLogs( ) throws IOException {
        return ApiResult.builder().build();
    }

    @PostMapping("/natural_sum")
    public ApiResult importFlowAboutNaturalSum(@RequestParam("file") MultipartFile file) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1. 读取文件名，然后进行文件名校验及MD5码校验
        //2. 读取压缩包中文件的内容，将每种类型的文件进行插库
        //3. 在插库操作中，保证事务性，若中间有插入失败，则回滚，返回插入失败
        //4.
        String originalFilename = file.getOriginalFilename();
        InputStream inputStream = file.getInputStream();

        String tmpDir = hotcProperties.getTmpDir();
        String parent = tmpDir + File.separator + originalFilename;

        //1. 将压缩文件解压到指定目录
        ZipUtils.unzip(parent, inputStream);

        //2. 从指定目录提取文件
        List<File> files = FileUtils.getFilesFrom(parent);

        //3. 将文件转化成相应的实体类
        if(files == null)
            return ApiResult.builder().code(0).msg("插入成功").build();

        Map<Class<?>, List> entityListMap = new HashMap<>();

        for (File f : files) {
            Class<?> aClass = getClass(f);
            List<?> objects = BeanUtils.transferTo(f, aClass);
            entityListMap.put(aClass, objects);
        }

        //4. 尝试将解压缩的文件进行入库
        importService.insertData(entityListMap);

        return ApiResult.builder().build();
    }

    @PostMapping("/squad_sum")
    public ApiResult importFlowAboutSquadSum(@RequestParam("file") MultipartFile file){
        return ApiResult.builder().build();
    }

    private Class<?> getClass(File file) {
        String fileName = file.getName();
        int i = fileName.indexOf('_');
        String key = fileName.substring(i + 1, fileName.indexOf('_', i + 1));
        return fileName2EntityMap.get(key);
    }

}
