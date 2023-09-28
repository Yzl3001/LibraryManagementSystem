package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //通过User的用户账号和用户密码查询用户信息
    @Override
    public User login(User user) { return userMapper.login(user);}

    /*
    新增用户
    @param user 新增的用户信息
    */
    public void addUser(User user) {
        //新增的用户 默认状态都设置为0,即在职状态
        user.setStatus("0");
        userMapper.addUser(user);
    }
}
