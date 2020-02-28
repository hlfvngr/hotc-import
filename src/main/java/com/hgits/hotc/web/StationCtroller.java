package com.hgits.hotc.web;

import com.hgits.hotc.utils.ExtractUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/api/v1/import")
public class StationCtroller {
    @Autowired
    private ExtractUtil extractUtil;

    private static final String DIRNAME = "D:\\txt";

    @GetMapping("/index")
    public String index(){
        return "index";
    }



    @PostMapping("/file")
    public String importData(@RequestParam("file") MultipartFile file, Model model) throws Exception {
        StringBuilder builder = new StringBuilder();
        //解压zip文件
        boolean flag = extractUtil.allShortestPathJsonExchangeTxT(file, "D:/txt");
/*        if(!flag){
            return new ResponseData().buildResponseData("404","解压zip文件失败");
        }*/

/*        boolean md5Flag = extractUtil.checkMD5(DIRNAME);

        if(!md5Flag){
            return new ResponseData().buildResponseData("404","验证MD5值失败");
        }*/
        //遍历txt文件
        extractUtil.readTxt(DIRNAME + "/txt");

        String tableName = file.getOriginalFilename().substring(0, file.getOriginalFilename().length() - 4);
        return "index";

    }


}
