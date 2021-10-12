package com.zhanghp.gray;

import org.springframework.stereotype.Component;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Component
public class RibbonParameters {
    private static final ThreadLocal LOCAL = new ThreadLocal();

    public static <T> T get(){
        return (T)LOCAL.get();
    }
    public static <T> void set(T t){
        LOCAL.set(t);
    }

}
