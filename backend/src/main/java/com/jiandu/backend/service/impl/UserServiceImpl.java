package com.jiandu.backend.service.impl;

import com.jiandu.backend.mapper.UserMapper;
import com.jiandu.backend.pojo.User;
import com.jiandu.backend.service.UserService;
import com.jiandu.backend.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        //加密
        String md5String = Md5Util.getMD5String(password);
        //添加
        userMapper.add(username, md5String);
    }
}
