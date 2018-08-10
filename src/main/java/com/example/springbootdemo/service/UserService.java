package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.User;

/**
 * {描述}
 *
 * @author: dhwang6
 * @date: 2018/8/10 16:16
 * @lastModified
 * @history
 */
public interface UserService {

    /**
     * 通过用户名获取用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    User getUserByUserName(String userName);

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    int addUser(User user);
}
