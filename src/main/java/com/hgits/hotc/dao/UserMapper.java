package com.hgits.hotc.dao;


import com.hgits.hotc.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertSelective(User user);

}
