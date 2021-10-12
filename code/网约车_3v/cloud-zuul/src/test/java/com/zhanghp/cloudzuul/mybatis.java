package com.zhanghp.cloudzuul;

import com.zhanghp.cloudzuul.entity.GrayTest;
import com.zhanghp.cloudzuul.mapper.GrayTestMapper;
import com.zhanghp.cloudzuul.mapper.GrayTestMapperCustom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: zhanghp
 * @version: 1.0
 */
@SpringBootTest
public class mybatis {
    @Autowired
    private GrayTestMapperCustom grayTestMapper;
    @Test
    void mybatistest(){
        List<GrayTest> select = grayTestMapper.select();
        for (GrayTest grayTest : select) {
            System.out.println(grayTest);
        }
    }
}
