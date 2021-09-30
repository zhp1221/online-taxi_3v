package com.zhanghp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class ZoneController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/zone")
    public String zone(){

        return restTemplate.getForObject("http://api-passenger/zone",String.class);
    }
    @RequestMapping("/test")
    public String test(){
        return "ssssssss";
    }
}
