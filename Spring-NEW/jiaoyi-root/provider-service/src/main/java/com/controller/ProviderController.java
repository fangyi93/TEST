package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
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
@RequestMapping("/hello")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        listUser.add("端口号:"+serverPort);
        return listUser;
    }
    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return serverPort+"Hello, " + name + " " + new Date();
    }

}
