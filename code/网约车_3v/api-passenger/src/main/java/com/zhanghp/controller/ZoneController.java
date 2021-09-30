package com.zhanghp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class ZoneController {
    @Value("${zone.name}")
    String name;
    @RequestMapping("/zone")
    public String zone(){
        return name;
    }
}
