package com.zhanghp.service;

import com.zhanghp.dto.ResponseResult;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public interface VerificationCodeService {
    public ResponseResult send(String phoneNumber);
}
