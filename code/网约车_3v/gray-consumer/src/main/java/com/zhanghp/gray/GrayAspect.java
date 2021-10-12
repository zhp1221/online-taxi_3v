package com.zhanghp.gray;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Aspect
@Component
public class GrayAspect {
    @Pointcut("execution(public String com.zhanghp.controller.*.port())")
    private void anyMethod(){}

    @Before(value = "anyMethod()")
    public void before(JoinPoint joinPoint){

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String version = request.getHeader("version");

        Map<String,String> map = new HashMap<>();
        map.put("version",version);

        RibbonParameters.set(map);

    }

    /**
     * 第三种灰度方法
     * @param joinPoint
     */
//    @Before(value = "anyMethod()")
//    public void before(JoinPoint joinPoint){
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String version = request.getHeader("version");
//        System.out.println(version);
//        if (version.trim().equals("v1")) {
//            RibbonFilterContextHolder.getCurrentContext().add("version","v1");
//        }
//    }
}
