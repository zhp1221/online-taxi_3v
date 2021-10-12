package com.zhanghp.service.impl;

import com.zhanghp.constant.CommonStatusEnum;
import com.zhanghp.constant.IdentityConstant;
import com.zhanghp.constant.RedisKeyPrefixConstant;
import com.zhanghp.dto.ResponseResult;
import com.zhanghp.dto.serviceverificationcode.VerifyCodeResponse;
import com.zhanghp.service.VerifyCodeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        //校验 发送时限，三挡验证，不能无限制发短信
        // redis 1min 3次 限制5min不能发。。1h发10次，24h不准发
        String code = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
        VerifyCodeResponse data = new VerifyCodeResponse();
        data.setCode(code);
        return ResponseResult.success(data);
    }

    @Override
    public ResponseResult verify(int identity, String phoneNumber, String code) {

        //三档验证


        //生成redis key
        String keyPre = generateKeyPreByIdentity(identity);
        String key = keyPre + phoneNumber;
        BoundValueOperations<String, String> codeRedis = redisTemplate.boundValueOps(key);
        String redisCode = codeRedis.get();

        if(StringUtils.isNotBlank(code)
                && StringUtils.isNotBlank(redisCode)
                && code.trim().equals(redisCode.trim())) {

            return ResponseResult.success("");
        }else {
            return ResponseResult.fail(CommonStatusEnum.VERIFY_CODE_ERROR.getCode(), CommonStatusEnum.VERIFY_CODE_ERROR.getValue());
        }
    }

    /**
     * 判断此手机号发送时限限制
     * @param phoneNumber
     * @return
     */
    private ResponseResult checkSendCodeTimeLimit(String phoneNumber){
        //判断是否有 限制1分钟，10分钟，24小时。

        return ResponseResult.success("");
    }

    /**
     * 根据身份类型生成对应的缓存key
     * @param identity
     * @return
     */
    private String generateKeyPreByIdentity(int identity){
        String keyPre = "";
        if (identity == IdentityConstant.PASSENGER){
            keyPre = RedisKeyPrefixConstant.PASSENGER_LOGIN_CODE_KEY_PRE;
        }else if (identity == IdentityConstant.DRIVER){
            keyPre = RedisKeyPrefixConstant.DRIVER_LOGIN_CODE_KEY_PRE;
        }
        return keyPre;
    }

    /**
     * 三档验证校验
     * @param phoneNumber
     * @param code
     * @return
     */
    private ResponseResult checkCodeThreeLimit(String phoneNumber,String code){
        //看流程图

        return ResponseResult.success("");
    }

    public static void main(String[] args) {

//        int count = 0;
//        for (int i = 0; i < 5000; i++) {
////            String code = String.valueOf(new Random().nextInt(1000000));
//            String code = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
//            if (code.length()<6){
//                System.out.println("有小于6位长的数"+i);
//                count++;
//            }
//        }
//        System.out.println(count);

// ----------------------------------------------------------------------
////        System.out.println(Math.random());
        long sum = 1000000000L;
//        int sum = Integer.MAX_VALUE;
        System.out.println(sum);
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < sum; i++) {
//            String a = (Math.random() + "").substring(2,8);
//        }
//        System.out.println("字符串截取时间："+(System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < sum; i++) {
            String a = String.valueOf((int)((Math.random()*9)*Math.pow(10,5)));
        }
        System.out.println("字符串求乘方："+(System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < sum; i++) {
            String a = String.valueOf((int)(Math. random()*900000)+100000);
        }
        System.out.println("感悟方案："+(System.currentTimeMillis() - start2));

        String a = String.valueOf((int)(Math. random()*900000)+100000) ;
        System.out.println(a);

    }
}
