package com.cxy.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ChenXingYu
 * @Date 2020/11/18 20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

    public CommonResult(T data){
        this.code = 1;
        this.message = "执行成功";
        this.data = data;
    }

}