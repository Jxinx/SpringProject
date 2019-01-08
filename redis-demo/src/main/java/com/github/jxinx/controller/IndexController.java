package com.github.jxinx.controller;

import com.github.jxinx.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * redis demo controller
 */

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/")
    public String index() {
        return "Hello Redis!";
    }

    /**
     * 操作redis生成唯一HT序列号
     */
    @RequestMapping("HT/")
    public String getHTSerialNo() {
        return redisService.getSerialNo("HT");
    }

    /**
     * 操作redis生成唯一GJ序列号
     */
    @RequestMapping("GJ/")
    public String getGJSerialNo() {
        return redisService.getSerialNo("GJ");
    }
}
