package com.zhanghp.controller;

import com.zhanghp.dto.ResponseResult;
import com.zhanghp.request.CheckPhoneRequest;
import com.zhanghp.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
@RequestMapping("/verify-code")
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;
    @RequestMapping("/send")
    public ResponseResult send(@RequestBody @Validated CheckPhoneRequest request){
        System.out.println(request.getPhoneNumber());
        return verificationCodeService.send(request.getPhoneNumber());
    }
}
