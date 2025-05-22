package com.jiandu.backend.mapper;

import com.jiandu.backend.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    // 根据用户名查询用户
    @Select("select * from user where username = #{username}")
    User findByUserName(String username);

    // 添加用户
    @Insert("insert into user (username, password) values (#{username}, #{password})")
    void add(@Param("username") String username, @Param("password") String md5String);
}