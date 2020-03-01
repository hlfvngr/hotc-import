package com.hgits.hotc.service;

import java.util.List;
import java.util.Map;

public interface ImportService {

    void saveData(Map<Class<?>, List<?>> entityListMap);

}
