package com.zhanghp.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Configuration
public class RestConfig {
    @LoadBalanced
    @Bean
    public RestTemplate rest(){
        return new RestTemplate();
    }
}
