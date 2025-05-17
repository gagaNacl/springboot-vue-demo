
package com.jiandu.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private Integer id;//主键id
    private String name;//用户名
    private String password;//用户密码
    private String nickname;//用户昵称
    private String email;//邮箱
    private String userPic;//用户头像地址
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间

}
