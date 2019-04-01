package com.neuedu.service.impl;

import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }
}
