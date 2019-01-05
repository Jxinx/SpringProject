package com.jxinx.service.impl;

import com.jxinx.dao.UserDao;
import com.jxinx.entity.User;
import com.jxinx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层
 * 实现类
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
