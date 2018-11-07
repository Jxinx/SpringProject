package com.jxinx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {

    /**
     * 缺省访问方法/index
     */
    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return "Hello SpringBoot！";
    }

    /**
     * 访问freemaker视图
     */
    @RequestMapping("/indexView")
    public String indexView() {
        return "index";
    }

}
