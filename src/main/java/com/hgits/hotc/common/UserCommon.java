package com.hgits.hotc.common;



import com.hgits.hotc.entity.User;
import com.hgits.hotc.utils.CommonUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCommon extends TransferCommon {

    @Override
    public User reflcMethodInvok(Class aclass, Method[] methods, String[] split, String[] headers) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException, ParseException {
        User user = new User();
        for (int i = 0; i < headers.length; i++) {
            for (int j = 0; j < methods.length; j++) {
                if (CommonUtils.isSetter(methods[j])) {
                    String concatStr = "set" + headers[i];
                    //方法名相同
                    if (methods[j].getName().equals(concatStr)) {
                        System.out.println("split[" + i + "]:" + split[i]);
                        //首字母小写
                        String fieldName = CommonUtils.toLowerCaseFirstOne(headers[i]);
                        Field field = aclass.getDeclaredField(fieldName);
                        String typeName = field.getGenericType().toString();

                        if (split.length > i) {
                            if (typeName.equals("class java.util.Date")) {
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                                Date dateParamter = sdf.parse(split[i]);
                                methods[j].invoke(user, dateParamter);
                            }
                            if (typeName.equals("class java.lang.String")) {
                                methods[j].invoke(user, split[i]);
                            }
                            if (typeName.equals("class java.lang.Short")) {
                                methods[j].invoke(user, Short.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Integer")) {
                                methods[j].invoke(user, Integer.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Byte")) {
                                methods[j].invoke(user, Byte.valueOf(split[i]));
                            }
                            if (typeName.equals("class java.lang.Double")) {
                                methods[j].invoke(user, Double.valueOf(split[i]));
                            }
                        } else {
                            if (typeName.equals("class java.util.Date")) {
                                methods[j].invoke(user, new Date());
                            }
                            if (typeName.equals("class java.lang.String")) {
                                methods[j].invoke(user, "");
                            }
                            if (typeName.equals("class java.lang.Short")) {
                                String name = methods[j].getName();
                                methods[j].invoke(user, new Short("0"));
                            }
                            if (typeName.equals("class java.lang.Integer")) {
                                methods[j].invoke(user, 0);
                            }
                            if (typeName.equals("class java.lang.Byte")) {
                                methods[j].invoke(user, 0);
                            }
                            if (typeName.equals("class java.lang.Double")) {
                                methods[j].invoke(user, 0);
                            }
                        }
                        break;
                    }
                }
            }
        }
        return user;
    }


}
