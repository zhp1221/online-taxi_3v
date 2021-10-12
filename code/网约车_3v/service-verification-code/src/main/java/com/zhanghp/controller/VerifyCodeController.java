package com.zhanghp.controller;

import com.zhanghp.dto.ResponseResult;
import com.zhanghp.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {
    @Autowired
    VerifyCodeService verifyCodeService;
    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity")int identity,@PathVariable("phoneNumber")String phoneNumber){

        return verifyCodeService.generate(identity,phoneNumber);
    }
}
