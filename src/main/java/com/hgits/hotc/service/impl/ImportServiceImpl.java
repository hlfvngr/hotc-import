package com.hgits.hotc.service.impl;

import com.hgits.hotc.common.service.impl.BaseService;
import com.hgits.hotc.service.ImportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class ImportServiceImpl implements ImportService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveData(Map<Class<?>, List<?>> entityListMap) {
        for (Map.Entry<Class<?>, List<?>> pair : entityListMap.entrySet()) {
            Class<?> key = pair.getKey();
            BaseService service = (BaseService)applicationContext.getBean(getServiceName(key));
            List<?> value = pair.getValue();
            log.info("当前插入流水类型为：{}, 数据量为：{}", key.getSimpleName(), value.size());
            service.saveAll(value);
        }
    }

    private String getServiceName(Class<?> key) {
        String name = key.getSimpleName();
        String serviceName = name.substring(0, name.length() - 4) + "Service";
        return serviceName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


}
