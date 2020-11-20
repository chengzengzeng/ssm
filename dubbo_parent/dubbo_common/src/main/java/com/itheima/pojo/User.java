package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 项目名：dubbo_parent
 * 包名：com.itheima.pojo
 * 作者：@Author chengzeng
 * 日期：@Date 2020/11/20 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;
}
