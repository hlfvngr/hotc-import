package com.hgits.hotc.common;





import com.hgits.hotc.entity.LaneExList;
import com.hgits.hotc.utils.CommonUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LaneExListCommom extends TransferCommon {
    private LaneExList laneExList;

    @Override
    public List<LaneExList> reflcMethodInvok(Class aclass, Method[] methods, String[] split, String[] headers) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException, ParseException {
        laneExList=new LaneExList();
        List<LaneExList> list=new ArrayList<>();
        for (int i = 0; i < headers.length; i++) {

            for (int j = 0; j < methods.length; j++) {
                if (CommonUtils.isSetter(methods[j])) {
                    String concatStr = "set" + headers[i];
                    //方法名相同
                    if (methods[j].getName().equals(concatStr)) {
                        //首字母小写
                        String fieldName = CommonUtils.toLowerCaseFirstOne(headers[i]);
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
                list.add(laneExList);
            }
        }
        return list;
    }



}
