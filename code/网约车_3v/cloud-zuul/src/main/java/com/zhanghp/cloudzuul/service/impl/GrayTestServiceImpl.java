package com.zhanghp.cloudzuul.service.impl;

import com.zhanghp.cloudzuul.entity.GrayTest;
import com.zhanghp.cloudzuul.mapper.GrayTestMapper;
import com.zhanghp.cloudzuul.service.GrayTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanghp
 * @since 2021-10-10
 */
@Service
public class GrayTestServiceImpl implements GrayTestService {
    @Autowired
    private GrayTestMapper grayTestMapper;

    public List<GrayTest> select(){
        return grayTestMapper.select();
    }
}
