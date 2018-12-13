package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@RestController
@RequestMapping("/user")
public class CustomerController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient client;

    @GetMapping("/getUser")
    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://provider-service/hello/getUserList", List.class);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        name += "!";
        ServiceInstance instance = client.choose("provider-service");
        String url = "http://" + instance.getServiceId()  + "/hello/?name=" + name;
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

}
