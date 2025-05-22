package com.jiandu.backend.controller;

import com.jiandu.backend.pojo.Result;
import com.jiandu.backend.pojo.User;
import com.jiandu.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        //查询用户是否已存在
        User u = userService.findByUserName(username);
        if (u == null) {
            //用户注册
            userService.register(username, password);
            return Result.success("注册成功");
        } else {
            //占用
            return Result.error("用户名已存在");
        }
    }
}
