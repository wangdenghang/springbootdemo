package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * {描述}
 *
 * @author: dhwang6
 * @date: 2018/8/10 16:16
 * @lastModified
 * @history
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过用户名获取用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    @Override
    @Transactional
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
