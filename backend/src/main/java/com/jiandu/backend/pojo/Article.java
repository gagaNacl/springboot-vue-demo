package com.jiandu.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {
    private Integer id;//主键id
    private String title;//文章标题
    private String content;//文章内容
    private String coverImg;//文章封面图
    private String state;//文章状态
    private Integer categoryId;//分类id
    private Integer createUser;//创建人id
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
