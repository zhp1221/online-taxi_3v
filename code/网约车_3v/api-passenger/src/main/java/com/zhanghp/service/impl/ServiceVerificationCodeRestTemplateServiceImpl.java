package com.zhanghp.service.impl;

import com.zhanghp.dto.ResponseResult;
import com.zhanghp.service.ServiceVerificationCodeRestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Service
public class ServiceVerificationCodeRestTemplateServiceImpl implements ServiceVerificationCodeRestTemplateService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public ResponseResult generatorCode(int identity, String phoneNumber) {
        String url = "http://service-verification-code:8081/verify-code/generate/"+identity+"/"+phoneNumber;
        ResponseResult result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<Object>(null, null), ResponseResult.class).getBody();
        return result;
    }
}
