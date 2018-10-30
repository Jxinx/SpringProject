package com.jxinx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/springboot")
public class IndexController {

    /**
     * index
     */
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello SpringBoot!";
    }

    /**
     * todo  跳转视图失败
     * @return 跳转视图
     */
    @RequestMapping("/indexView")
    public String indexView() {
        return "index.jsp";
    }
}
