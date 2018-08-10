package com.example.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * {配置属性}
 *
 * @author: dhwang6
 * @date: 2018/8/10 14:14
 * @lastModified
 * @history
 */
@Component
public class configProperties {

    @Value("${title}")
    private String title;

    @Value("${description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
