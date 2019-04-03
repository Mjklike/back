package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserService {
        int add(User user);
        List<User> list();
}
