package com.zhanghp.gray;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: zhanghp
 * @version: 1.0
 */
public class GrayRibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        return new GrayRule();
    }
}
