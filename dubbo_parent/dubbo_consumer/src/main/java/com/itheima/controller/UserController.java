package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名：dubbo_parent
 * 包名：com.itheima.controller
 * 作者：@Author chengzeng
 * 日期：@Date 2020/11/20 16:34
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(int id) {
        return userService.findById(id);
    }
}
