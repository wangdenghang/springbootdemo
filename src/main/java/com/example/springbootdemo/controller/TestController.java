package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {描述}
 *
 * @author: dhwang6
 * @date: 2018/8/9 10:22
 * @lastModified
 * @history
 */
@RestController
@RequestMapping("v1")
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "hello world";
    }
}
