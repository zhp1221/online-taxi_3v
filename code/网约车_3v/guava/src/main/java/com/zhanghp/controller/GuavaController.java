package com.zhanghp.controller;

import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@RestController
public class GuavaController {
    @Autowired
    LoadingCache<String,String> cache;
    @RequestMapping("/set/{id}")
    public String set(@PathVariable("id") String id){
        cache.put(id,"一二三");
        return "success";

    }

    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id") String id){
        String value = null;
        try {
            value = cache.get(id).toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return value;
    }
}
