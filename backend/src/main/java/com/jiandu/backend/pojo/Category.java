package com.jiandu.backend.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    private Integer id;//主键id
    private String categoryName;//分类名称
    private String categryAlias;//分类别名
    private Integer ccreatUser;//创建人id
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
