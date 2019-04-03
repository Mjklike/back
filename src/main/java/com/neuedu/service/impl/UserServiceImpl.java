package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return 0;
    }
    @Override
    public List<User> list() {
        PageHelper.startPage(1, 5);
        return userMapper.selectByExample(new UserExample());
    }
}
