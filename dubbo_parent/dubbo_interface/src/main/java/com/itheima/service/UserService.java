package com.itheima.service;

import com.itheima.pojo.User;

/**
 * 项目名：dubbo_parent
 * 包名：com.itheima.service
 * 作者：@Author chengzeng
 * 日期：@Date 2020/11/20 14:11
 */
public interface UserService {
    User findById(int id);
}
