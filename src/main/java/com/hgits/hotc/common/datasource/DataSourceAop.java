package com.hgits.hotc.common.datasource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop {

    @Before("execution(* com.hgits.hotc.service.logimpl.*.insert*(..))")
    public void setDataSource2Master() {
        System.err.println("日志记录");
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.MASTER);
    }

    @Before("execution(* com.hgits.hotc.service.impl.*.save*(..))")
    public void setDataSource2Slave() {
            System.err.println("流水插库");
            DataSourceType.setDataBaseType(DataSourceType.DataBaseType.SLAVE);
        }
    }
