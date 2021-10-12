package com.zhanghp.cloudzuul.mapper;

import com.zhanghp.cloudzuul.entity.GrayTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanghp
 * @since 2021-10-10
 */
@Mapper
public interface GrayTestMapper {
    public List<GrayTest> select();

}
