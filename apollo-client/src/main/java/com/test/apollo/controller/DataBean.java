package com.test.apollo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author Mirko
 * @Description
 * @createTime 2020年03月03日 01:54:00
 */
@Component
@ConfigurationProperties(prefix = "yz.client")
@RefreshScope
public class DataBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
