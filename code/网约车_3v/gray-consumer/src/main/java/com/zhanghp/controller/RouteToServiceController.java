package com.zhanghp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class RouteToServiceController {
    @RequestMapping("/test31")
    public String test31(){
        return "31";
    }
    @RequestMapping("/test3")
    public String test3(){
        return "3333333333333333333";
    }

}
