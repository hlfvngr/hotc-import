package com.hgits.hotc.service.logimpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hgits.hotc.dao.LogMapper;
import com.hgits.hotc.entity.Log;
import com.hgits.hotc.service.LogService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Resource
    LogMapper logMapper;

    @Override
    public PageInfo<Log> listByPage(Page<Log> page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());

        Example example = new Example(Log.class);

        List<Log> logs = logMapper.selectByExample(example);

        PageInfo<Log> info = new PageInfo<>(logs);
        return info;
    }

    @Override
    public void insert(Log aLog) {
        logMapper.insert(aLog);
    }
}
