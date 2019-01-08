package com.github.jxinx.service.impl;

import com.github.jxinx.dao.RedisDao;
import com.github.jxinx.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * redis service implement
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisDao redisDao;

    @Override
    public String getSerialNo(String type) {
        return redisDao.getSerialNo(type);
    }
}
