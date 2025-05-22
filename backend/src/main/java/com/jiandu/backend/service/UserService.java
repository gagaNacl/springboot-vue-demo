package com.jiandu.backend.service;

import com.jiandu.backend.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    //注册用户
    void register(String username, String password);
}
