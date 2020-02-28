package com.hgits.hotc.service.impl;

import com.hgits.hotc.dao.UserMapper;
import com.hgits.hotc.entity.User;
import com.hgits.hotc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insert(User user) {
        userMapper.insertSelective(user);
    }
}
