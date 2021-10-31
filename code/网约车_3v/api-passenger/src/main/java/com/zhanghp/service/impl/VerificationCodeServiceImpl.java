package com.zhanghp.service.impl;

import com.zhanghp.constant.IdentityConstant;
import com.zhanghp.dto.ResponseResult;
import com.zhanghp.service.ServiceVerificationCodeRestTemplateService;
import com.zhanghp.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Service
public class VerificationCodeServiceImpl implements VerificationCodeService {
    @Autowired
    private ServiceVerificationCodeRestTemplateService serviceVerificationCodeRestTemplateService;
    @Override
    public ResponseResult send(String phoneNumber) {
        System.out.println(IdentityConstant.PASSENGER);
        System.out.println(IdentityConstant.DRIVER);
        ResponseResult responseResult = serviceVerificationCodeRestTemplateService.generatorCode(IdentityConstant.PASSENGER, phoneNumber);
        int data =(int)responseResult.getData();
        System.out.println("------------"+data);
        return null;
    }
}
