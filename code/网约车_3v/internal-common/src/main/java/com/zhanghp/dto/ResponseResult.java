package com.zhanghp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
/**
 * setter方法返回当前对象，责任链模式
 */
@Accessors(chain = true)
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
}
