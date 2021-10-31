package com.zhanghp.service;

import com.zhanghp.dto.ResponseResult;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public interface ServiceVerificationCodeRestTemplateService {
    /**
     * 生成验证码，根据身份储存到redis
     *
     * @param identity 乘客/司机的身份牌
     * @param phoneNumber 手机号码
     * @return
     */
    public ResponseResult generatorCode(int identity,String phoneNumber);
}
