package com.zhanghp.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.jmnarloch.spring.cloud.ribbon.api.RibbonFilterContext;
import io.jmnarloch.spring.cloud.ribbon.support.RibbonFilterContextHolder;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zhanghp
 * @version: 1.0
 */
//@Component
public class GrayFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }


    @Override
    public Object run() throws ZuulException {
        System.out.println("zuul-------------------------");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        int userId = Integer.parseInt(request.getHeader("userId"));
        // 查库

        //灰度
        if (userId == 1) {
            RibbonFilterContextHolder.getCurrentContext().add("version","v1");
        }else if(userId == 2){
            RibbonFilterContextHolder.getCurrentContext().add("version","v2");
        }
        // 不向后面顾虑器执行，因为ribbonroutefilter的shouldfilter判断了条件
        currentContext.setSendZuulResponse(false);
        return null;
    }
}
