package com.hgits.hotc.utils;


import com.hgits.hotc.entity.LaneExList;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * @author panhou
 * @description zip解压工具类
 * @date 2020/02/21
 */
@Component
public class ExtractUtil_bak {


    public boolean allShortestPathJsonExchangeTxT(MultipartFile file, String pathDir) {

        String name = file.getOriginalFilename();
        boolean flag = false;
        try {
            File tempFile = new File(pathDir);
            file.transferTo(tempFile);
            //解压文件
            flag = FileUtil.decompressZip(name, pathDir);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

/*    *//**
     * 验证MD5值
     *
     * @param fileName
     * @return
     *//*
    public boolean checkMD5(String fileName) throws IOException {
        boolean flag = true;

        File file = new File(fileName);
        FileInputStream fis = null;
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()) {
                String[] split = listFile.getName().split("_");
                String fileMD5 = split[5];
                fis = new FileInputStream(listFile);
                String md5 = DigestUtils.md5Hex(fis).toUpperCase();
                fis.close();
                if (!md5.equals(fileMD5)) {
                    return false;
                }
            }
        }
        return flag;
    }*/



    public void readTxt(String pathDir) {
        InputStream inputStream = null;
        BufferedReader reader = null;
        InputStreamReader inputStreamReader = null;
        StringBuilder jsonStrs = new StringBuilder();

        File files = new File(pathDir);
        String tempStr = null;
        List<Object> resultList = new ArrayList<>();
        String context=null;

        try {
            for (File listFile : files.listFiles()) {
                if (listFile.isFile()) {
                    inputStream = new FileInputStream(listFile);
                    inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    reader = new BufferedReader(inputStreamReader);

                    while (true) {
//                        line++;
                        if (!((tempStr = reader.readLine()) != null)) break;
//                        if (line == 1) {continue;}

                        String content = reader.readLine();
                        String[] contents = content.split("\t");



                        jsonStrs.append(tempStr + "\n\t");
                        String texName = listFile.getName();
                        System.out.println("读取的TXT内容：" + "\n\t" + jsonStrs.toString());
                        //读取到文本内容 并导入数据库对应表中
                        if (texName.equals("tb_EnPass_Recv")) {
                            reflcMethod(LaneExList.class,contents);
                        }
                        if (texName.equals("tb_ExPass_Recv")) {

                        }
                        if (texName.equals("tb_ExEtcTrans_Recv")) {

                        }
                        if (texName.equals("tb_OtherTrans_Recv")) {

                        }
                        if (texName.equals("tb_GantryTrans_Recv")) {

                        }
                        if (texName.equals("tb_LaneEnCount_Recv")) {

                        }
                        if (texName.equals("tb_LaneExCount_Recv")) {

                        }
                        if (texName.equals("tb_LaneShift_Recv")) {

                        }
                        if (texName.equals("tb_VehIdImageOnDemand_Recv")) {

                        }
                        reader.close();
//                    listFile.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void printGettersSetters(Class aClass) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Method[] methods = aClass.getDeclaredMethods();
        Field field = aClass.getDeclaredField("msgId");
        field.setAccessible(true);
        LaneExList laneExList = (LaneExList) aClass.newInstance();
        field.set(laneExList, "10086");

        System.out.println("反射的赋值msgId:" + laneExList.getMsgId());

        for (Method method : methods) {
//            if(isGetter(method)) System.out.println("getter: " + method);
            if (isSetter(method)) System.out.println("setter: " + method);
        }
    }

    public static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) return false;
        if (method.getParameterTypes().length != 1) return false;
        return true;
    }

    public void reflcMethod(Class aClass, String[] contens) {
        Method[] methods = aClass.getDeclaredMethods();
        List<Method> methodList=new ArrayList<>();

        for(int i=0;i<contens.length;i++){
            for (int j=0;j<methods.length;j++){
                if (isSetter(methods[j])){
                    methodList.add(methods[j]);
                    System.out.println("setter: " + methods[j]);
                }
            }
        }


    }

}
