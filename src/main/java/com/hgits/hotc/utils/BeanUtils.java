package com.hgits.hotc.utils;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class BeanUtils {

    public static <T> List<T> transferTo(File file, Class<T> clazz) throws IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
        List<T> result = new ArrayList<>();

        Map<String, Method> methodMap = getSetMethodFrom(clazz);

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String fieldListStr = reader.readLine();

        if(fieldListStr == null || fieldListStr.length() == 0) {
            throw new RuntimeException("表头字段为空！");
        }

        String[] fields = fieldListStr.split("\t");

        String line = null;

        while(null != (line = reader.readLine())){
            String[] values = line.split("\t");
            T t = clazz.newInstance();

            for (int i = 0; i < fields.length; i++) {
                String field = fields[i];
                String setMethodName = "set" + capitalCamel(field);
                if(methodMap.containsKey(setMethodName)){
                    Method method = methodMap.get(setMethodName);
                    //此处需要对参数进行处理
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Object val = null;
                    if (parameterTypes[0].isAssignableFrom(Date.class)){
                        val = DateUtils.parse(values[i]);
                    } else {
                        val = parameterTypes[0].cast(values[i]);
                    }

                    method.invoke(t, val);
                }
            }
            result.add(t);
        }

        return result;
    }


    public static Map<String, Method> getSetMethodFrom(Class<?> clazz){
        if(clazz == null ) return Collections.emptyMap();

        Map<String, Method> methodMap = new HashMap<>();

        Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            if(methods[i].getName().startsWith("set")) {
                methodMap.put(methods[i].getName(), methods[i]);
            }
        }
        return methodMap;
    }

    public static String capitalCamel(String s){
        if(s == null || s.length() == 0 || !s.matches("[A-Za-z]\\w*")){
            throw new RuntimeException("字段名不符合要求！");
        }
        char first = s.charAt(0);

        if('a' <= first && first <= 'z') {
            return (char)(first - 32) + s.substring(1);
        }
        return s;
    }
}
