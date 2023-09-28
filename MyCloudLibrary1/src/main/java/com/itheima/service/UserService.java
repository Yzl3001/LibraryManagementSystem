package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {
    //通过User的用户账号和用户密码查询用户信息
    User login(User user);

    void addUser(User user);
}
