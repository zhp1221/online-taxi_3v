package com.zhanghp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class GrayController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/port")
    public String port(){
        return restTemplate.getForObject("http://gray-provider/port",String.class);
    }
}
