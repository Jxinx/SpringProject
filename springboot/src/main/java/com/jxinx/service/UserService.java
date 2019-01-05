package com.jxinx.service;

import com.jxinx.entity.User;

/**
 * 业务逻辑层
 * 接口
 */
public interface UserService {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return 用户信息
     */
    User findUserById(Integer id);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);
}
