package com.github.jxinx.service;

/**
 * redis service interface
 */
public interface RedisService {

    /**
     * 根据类型不同，生成对应的序列号
     */
    String getSerialNo(String type);
}
