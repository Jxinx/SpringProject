package com.jxinx.controller;

import com.jxinx.entity.User;
import com.jxinx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return 用户信息json字符串
     */
    @RequestMapping("/query")
    public User queryUser(Integer id) {
        return userService.findUserById(id);
    }

    /**
     * 新增用户
     */
    @RequestMapping("/add")
    public String addUser(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.addUser(user);
        return "add success!";
    }
}
