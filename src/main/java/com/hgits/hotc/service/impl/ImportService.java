package com.hgits.hotc.service.impl;

import java.util.List;
import java.util.Map;

public interface ImportService {

    void insertData(Map<Class<?>, List<?>> entityListMap);

}
