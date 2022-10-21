package com.lddong.springcloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lddong
 * @create 2022-10-21 23:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private  String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);

    }
}
