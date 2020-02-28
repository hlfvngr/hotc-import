package com.hgits.hotc.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;

public abstract class TransferCommon {

    public abstract Object reflcMethodInvok(Class aclass, Method[] methods, String[] split, String[] headers) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException, ParseException;


}
