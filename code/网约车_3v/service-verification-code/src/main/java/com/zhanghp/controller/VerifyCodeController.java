package com.zhanghp.controller;

import com.zhanghp.dto.ResponseResult;
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
    @RequestMapping("/generate/{id}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("id")int id,@PathVariable("phoneNumber")String phoneNumber){
        System.out.println(id);
        System.out.println(phoneNumber);
        return new ResponseResult().setData(404);
    }
}
