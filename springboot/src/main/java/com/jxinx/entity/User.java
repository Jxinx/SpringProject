package com.jxinx.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体
 */
@Data
public class User implements Serializable {

    /**
     * id : 4
     * name : ls
     * age : 12
     */

    private Integer id;//主键
    private String name;//名字
    private Integer age;//年龄
}
