package com.zhanghp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class grayController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/port")
    public String port(){
        return "gray-provider"+port;

    }
}
