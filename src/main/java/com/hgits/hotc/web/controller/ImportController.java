package com.hgits.hotc.web.controller;

import com.hgits.hotc.entity.vo.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Slf4j
@Controller
@RequestMapping("/api/v1/import")
public class ImportController {

    @PostMapping("/logs")
    public ApiResult selectImportLogs( ) throws IOException {
        return ApiResult.builder().build();
    }

    @PostMapping("/natural_sum")
    public ApiResult importFlowAboutNaturalSum(MultipartFile file) throws IOException {
        //1. 读取文件名，然后进行文件名校验及MD5码校验
        //2. 读取压缩包中文件的内容，将每种类型的文件进行插库
        //3. 在插库操作中，保证事务性，若中间有插入失败，则回滚，返回插入失败
        //4.
        String originalFilename = file.getOriginalFilename();
        InputStream inputStream = file.getInputStream();

        ZipInputStream zis = new ZipInputStream(inputStream);

        ZipEntry nextEntry = zis.getNextEntry();

        String name = file.getName();

        return ApiResult.builder().build();
    }


    @PostMapping("/squad_sum")
    public ApiResult importFlowAboutSquadSum(){
        return ApiResult.builder().build();
    }
}
