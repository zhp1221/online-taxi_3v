package com.zhanghp.service;


import com.zhanghp.dto.ResponseResult;
import com.zhanghp.dto.servicesms.SmsSendRequest;

public interface SmsService {
	/**
	 * 发送短信
	 * @param request
	 * @return
	 */
	public ResponseResult sendSms(SmsSendRequest request);
}
