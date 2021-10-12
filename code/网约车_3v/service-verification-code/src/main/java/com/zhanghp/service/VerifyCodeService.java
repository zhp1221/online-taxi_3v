package com.zhanghp.service;

import com.zhanghp.dto.ResponseResult;
import com.zhanghp.dto.serviceverificationcode.VerifyCodeResponse;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public interface VerifyCodeService {

    /**
     * 根据身份和手机号生成验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    public ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);

    /**
     * 校验身份，手机号，验证码的合法性
     * @param identity
     * @param phoneNumber
     * @param code
     * @return
     */
    public ResponseResult verify(int identity, String phoneNumber, String code);
}
