package com.zhanghp.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;


/**
 * @author: zhanghp
 * @version: 1.0
 */
@Component
public class RouteToServiceFilter extends ZuulFilter {
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
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String remoteURL = request.getRequestURI();
        if (remoteURL.contains("test31")) {
            currentContext.set(FilterConstants.SERVICE_ID_KEY,"gray-consumer");
            currentContext.set(FilterConstants.REQUEST_URI_KEY,"/test3");
            try {
                currentContext.setRouteHost(new URI("http://localhost:9000/").toURL());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
