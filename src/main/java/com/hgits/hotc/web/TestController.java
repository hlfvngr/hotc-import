package com.hgits.hotc.web;

import com.alibaba.fastjson.JSON;
import com.hgits.hotc.model.Gantry;
import com.hgits.hotc.service.GantryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件名称(File Name)：TestController
 * 功能描述(Description)：此模块的功能描述与大概流程说明
 * 数据表(Tables)：本文件中所操作过的数据表
 * 作者(Author)：  zerro
 * 日期(Create Date)：2020/2/24
 * 修改记录(Revision History)：
 */
@RestController
public class TestController {

    @Autowired
    private GantryService gantryService;

    @RequestMapping("/testQuery")
    public String testQuery(){
        List<Gantry> a = gantryService.selectAll();
        return JSON.toJSONString(a);
    }
}
