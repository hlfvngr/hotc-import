package com.hgits.hotc.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hgits.hotc.entity.Log;

public interface LogService {

    PageInfo<Log> listByPage(Page<Log> page);

    void insert(Log aLog);
}
