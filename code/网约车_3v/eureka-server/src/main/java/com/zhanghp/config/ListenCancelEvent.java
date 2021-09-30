package com.zhanghp.config;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zhanghp
 * @version: 1.0
 */

@Component
public class ListenCancelEvent {

    @EventListener
    public void listen(@RequestParam EurekaInstanceCanceledEvent event){
        // 发邮件 短信
        System.out.println("下线:"+event.getServerId());
    }


}
