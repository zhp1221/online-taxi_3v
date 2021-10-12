package com.zhanghp.service;


import com.zhanghp.dto.ResponseResult;

public interface ServiceSmsRestTemplateService {

    public ResponseResult sendSms(String phoneNumber, String code);
}
