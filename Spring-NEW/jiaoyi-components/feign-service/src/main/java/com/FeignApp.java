package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@EnableFeignClients
@SpringBootApplication
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class, args);
    }

}
