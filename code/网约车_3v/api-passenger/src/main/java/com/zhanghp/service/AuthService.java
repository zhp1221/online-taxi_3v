package com.zhanghp.service;


import com.zhanghp.dto.ResponseResult;

public interface AuthService {
    public ResponseResult auth(String passengerPhone, String code);
}
