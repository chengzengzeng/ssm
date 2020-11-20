package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名：dubbo_parent
 * 包名：com.itheima.service.impl
 * 作者：@Author chengzeng
 * 日期：@Date 2020/11/20 14:19
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
