package com.jiandu.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;//状态码
    private String message;//提示信息
    private T data;//返回数据.

    //快速返回操作成功响应结果（带响应数据）
    public static <E> Result<E> success(E data) {
        return new Result<>(200, "success", data);
    }
    //快速返回操作成功响应结果
    public static Result success() {
        return new Result(200, "success", null);
    }
    public static Result error() {
        return new Result(500, "error", null);
    }
    // 新增：带自定义错误信息的方法
    public static Result error(String message) {
        return new Result(500, message, null);
    }
}
