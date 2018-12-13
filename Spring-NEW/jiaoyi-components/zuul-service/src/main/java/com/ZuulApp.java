package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
