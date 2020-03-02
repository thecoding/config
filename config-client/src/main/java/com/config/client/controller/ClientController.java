package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mirko
 * @Description
 * @createTime 2020年02月21日 00:07:00
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${info}")
    String info;

    @RequestMapping("/info")
    public String test(){
        return info;
    }
}
