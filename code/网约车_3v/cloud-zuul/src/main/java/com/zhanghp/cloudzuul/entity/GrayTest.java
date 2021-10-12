package com.zhanghp.cloudzuul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhanghp
 * @since 2021-10-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrayTest implements Serializable {

    private Integer id;

    private Integer userId;

    private String version;


}
