package com.zhanghp.config;



import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Configuration
public class Guava {
    @Bean
    public LoadingCache<String,String> ll(){
        LoadingCache<String,String> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return "load:"+new Random().nextInt(100);
                    }
                });
        return cache;
    }
}
