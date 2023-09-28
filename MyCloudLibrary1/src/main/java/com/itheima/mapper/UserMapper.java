package com.itheima.mapper;

import com.github.pagehelper.Page;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    @Select("select * from user where user_email=#{email} AND user_password=#{password} AND user_status!='1'")
    @Results(id = "userMap", value = {
        //id字段默认为false，表示不是主键
        //column表示数据库表字段，property表示实体类属性名。
        @Result(id = true, column = "user_id", property = "id"),
        @Result(column = "user_name", property = "name"),
        @Result(column = "user_password", property = "password"),
        @Result(column = "user_email", property = "email"),
        @Result(column = "user_role", property = "role"),
        @Result(column = "user_status", property = "status")
    })
    //用户登录
    User login(User user);

    void addUser(User user);
}
