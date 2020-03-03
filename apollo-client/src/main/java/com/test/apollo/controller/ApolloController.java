package com.test.apollo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mirko
 * @Description
 * @createTime 2020年02月21日 16:17:00
 */
@RestController
public class ApolloController {

    @Value("${server.port:7000}")
    String serverPort;

    @Value("${apolloinfo:default}")
    String apolloinfo;

    @Value("${gray.release:default}")
    String grayRelease;

    @Autowired
    DiscoveryClient  discoveryClient;

    @Resource
    DataBean dataBean;




    @RequestMapping("/info")
    public Map getProperties(){
        Map map = new HashMap<>();
        map.put("serverPort", serverPort);
        map.put("apolloinfo", apolloinfo);
        map.put("grayRelease", grayRelease);
        map.put("dataBean.name", dataBean.getName());
        return map;
    }


    @RequestMapping("/serviceInfo")
    public List<ServiceInstance> getCurrentServiceInfo(){
        List<String> serviceList = discoveryClient.getServices();
        Gson gson = new Gson();
        for (String str : serviceList) {
            String s = gson.toJson(discoveryClient.getInstances(str));
            System.out.println(s);
        }
        return discoveryClient.getInstances("apollo2");
    }

}
