package com.hgits.hotc.utils;


import com.hgits.hotc.common.UserCommon;
import com.hgits.hotc.entity.LaneExList;
import com.hgits.hotc.entity.User;
import com.hgits.hotc.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author panhou
 * @description zip解压工具类
 * @date 2020/02/21
 */
@Component
public class ExtractUtil {

    @Autowired
    private UserService userService;


    public boolean allShortestPathJsonExchangeTxT(MultipartFile file, String pathDir) throws IOException {

        String name = file.getOriginalFilename();
        boolean flag = false;
        File tempFile = new File(pathDir + "/" + name);
        file.transferTo(tempFile);
        //解压文件
        flag = FileUtil.decompressZip(name, pathDir);

        return flag;
    }

    /**
     * 验证MD5值
     *
     * @param fileName
     * @return
     */
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
    }


    public void readTxt(String pathDir) throws Exception {
        InputStream inputStream = null;
        BufferedReader reader = null;
        InputStreamReader inputStreamReader = null;
        StringBuilder jsonStrs = new StringBuilder();

        File files = new File(pathDir);
        String tempStr = null;
        for (File listFile : files.listFiles()) {
            if (listFile.isFile()) {
                inputStream = new FileInputStream(listFile);
                inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                reader = new BufferedReader(inputStreamReader);
                String firstContent = reader.readLine();
                String[] headers = firstContent.split("\t");
                Set<User> hashSet = new HashSet<User>();
                List<User> list = new ArrayList<>();
                while (true) {
                    if (!((tempStr = reader.readLine()) != null)) break;
                    String[] split = tempStr.split("\t");
                    jsonStrs.append(tempStr + "\n\t");
                    String texName = listFile.getName();
                    //读取到文本内容 并导入数据库对应表中
                    UserCommon userCommon = new UserCommon();
                    User user = new User();
                    Method[] methods = user.getClass().getDeclaredMethods();
                    User resultUser = userCommon.reflcMethodInvok(user.getClass(), methods, split, headers);
                    userService.insert(resultUser);
                    list.add(resultUser);
                }
                for (User u : list) {
                    System.out.println(u);
                }
                listFile.delete();
            }

        }
        if (reader != null) {
            reader.close();
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (inputStream != null) {
            inputStream.close();
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
            if (isSetter(method)) System.out.println("setter: " + method);
        }
    }

    public static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) return false;
        if (method.getParameterTypes().length != 1) return false;
        return true;
    }

    public void reflcMethod(Class aclass, Method[] methods, String[] split, String[] headers) throws NoSuchFieldException, IllegalAccessException, ParseException, InvocationTargetException, InstantiationException {

        for (int i = 0; i < headers.length; i++) {
            LaneExList laneExList = new LaneExList();
            for (int j = 0; j < methods.length; j++) {
                if (isSetter(methods[j])) {
                    String concatStr = "set" + headers[i];
                    //方法名相同
                    if (methods[j].getName().equals(concatStr)) {
                        //首字母小写
                        String fieldName = toLowerCaseFirstOne(headers[i]);
                        Field field = aclass.getDeclaredField(fieldName);
                        String typeName = field.getGenericType().toString();
                        if (split.length >= i) {
                            if (typeName.equals("class java.util.Date")) {
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                                Date dateParamter = sdf.parse(split[i]);
                                methods[j].invoke(laneExList, dateParamter);
                            }
                            if (typeName.equals("class java.lang.String")) {
                                methods[j].invoke(laneExList, split[i]);
                            }
                            if (typeName.equals("class java.lang.Short")) {
                                methods[j].invoke(laneExList, Short.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Integer")) {
                                methods[j].invoke(laneExList, Integer.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Byte")) {
                                methods[j].invoke(laneExList, Byte.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Double")) {
                                methods[j].invoke(laneExList, Double.valueOf(split[i]));
                            }
                        } else {
                            if (typeName.equals("class java.util.Date")) {
                                methods[j].invoke(laneExList, new Date());
                            }
                            if (typeName.equals("class java.lang.String")) {
                                methods[j].invoke(laneExList, "");
                            }
                            if (typeName.equals("class java.lang.Short")) {
                                String name = methods[j].getName();
                                methods[j].invoke(laneExList, new Short("0"));
                            }
                            if (typeName.equals("class java.lang.Integer")) {
                                methods[j].invoke(laneExList, 0);
                            }
                            if (typeName.equals("class java.lang.Byte")) {
                                methods[j].invoke(laneExList, 0);
                            }
                            if (typeName.equals("class java.lang.Double")) {
                                methods[j].invoke(laneExList, 0);
                            }
                        }
//                        System.out.println("拼接的set方法名：" + concatStr + " 赋值是: " + split[i] + " 属性名：" + field.getGenericType());
                    }
                }
            }
        }


    }

    /**
     * 首字母转小写
     *
     * @param s
     * @return
     */
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

}
