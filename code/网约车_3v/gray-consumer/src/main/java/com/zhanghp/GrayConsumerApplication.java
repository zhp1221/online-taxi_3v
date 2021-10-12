package com.zhanghp;

import com.zhanghp.gray.GrayRibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RibbonClient(name = "gray-provider",configuration = GrayRibbonConfiguration.class)
public class GrayConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrayConsumerApplication.class, args);
    }


}
