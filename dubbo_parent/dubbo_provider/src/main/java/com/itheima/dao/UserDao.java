package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * 项目名：dubbo_parent
 * 包名：com.itheima.dao
 * 作者：@Author chengzeng
 * 日期：@Date 2020/11/20 14:17
 */
public interface UserDao {
    @Select("select * from t_user where id = #{1}")
    User findById(int id);
}
