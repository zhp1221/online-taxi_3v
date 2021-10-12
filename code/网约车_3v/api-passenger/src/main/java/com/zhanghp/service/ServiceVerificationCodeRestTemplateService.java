package com.zhanghp.service;


import com.zhanghp.dto.ResponseResult;

public interface ServiceVerificationCodeRestTemplateService {

    public ResponseResult generatorCode(int identity, String phoneNumber);

    public ResponseResult verifyCode(int identity, String phoneNumber, String code);
}
