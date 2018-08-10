package com.example.springbootdemo.controller;

import com.example.springbootdemo.base.ResultDto;
import com.example.springbootdemo.base.SysCode;
import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * {用户信息}
 *
 * @author: dhwang6
 * @date: 2018/8/10 16:10
 * @lastModified
 * @history
 */
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 日志信息
     */
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 通过用户名获取用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    @RequestMapping(value = "getInfo/{userName}")
    public ResultDto getUser(@PathVariable String userName) {
        try {
            User user = userService.getUserByUserName(userName);
            return new ResultDto(Boolean.TRUE, SysCode.RETURN_CODE.SUCCESS.getCode(), user);
        } catch (Exception e) {
            log.error("通过用户名获取用户信息失败，异常信息:", e);
            return new ResultDto(Boolean.FALSE, SysCode.RETURN_CODE.FAIL.getCode());
        }
    }

    /**
     * 添加用户
     *
     * @param user 用户信息
     * @return 是否成功
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return new ResultDto(Boolean.TRUE, SysCode.RETURN_CODE.SUCCESS.getCode());
        } catch (Exception e) {
            log.error("通过用户名获取用户信息失败，异常信息:", e);
            return new ResultDto(Boolean.FALSE, SysCode.RETURN_CODE.FAIL.getCode());
        }
    }

}
