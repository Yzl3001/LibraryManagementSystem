package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.entity.Result;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    //@RequestMapping("/toMainPage")
    //public String toMainPage() {return "main";}
    //注入userService
    @Autowired
    private UserService userService;

    //用户登录
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        try {
            User u = userService.login(user);
            /*
            用户账号和密码是否查询出用户信息
                是：将用户信息存入Session，并跳转到后台首页
                否：Request域中添加提示信息，并转发到登录页面
            */
            if (u != null) {
                request.getSession().setAttribute("USER_SESSION", u);
                //System.out.println("成功");
                /*String role = u.getRole();
                if ("ADMIN".equals(role)) {
                    return "redirect:/admin/main.jsp";
                } else {
                    return "redirect:/admin/index.jsp";
                }*/
                return "redirect:/admin/main.jsp";
            }
            request.setAttribute("msg", "用户名或密码错误");
            //System.out.println("失败1");
            return "forward:/admin/login.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg", "系统错误");
            //System.out.println(e);
            return "forward:/admin/login.jsp";
        }
    }
    //注销登录
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession();
            //销毁Session
            session.invalidate();
            return "forward:/admin/login.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg", "系统错误");
            return "forward:/admin/login.jsp";
        }
    }


    @ResponseBody
    @RequestMapping("/addUser")
    public Result addUser(User user) {
        try {
            userService.addUser(user);
            return new Result(true, "新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "新增失败!");
        }
    }

}
