package com.itheima.test;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring-service.xml")
@ContextConfiguration(locations = "classpath:spring-provider.xml")

public class ProviderTest {
    @Autowired
    private UserService userService;

    @Test
    public void test01() throws Exception {

        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        //UserService userService = app.getBean(UserService.class);
        //User user = userService.findById(1);
        //System.out.println(user);
        System.in.read();
    }
}
