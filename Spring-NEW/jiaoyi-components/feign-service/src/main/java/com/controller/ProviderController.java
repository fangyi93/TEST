package com.controller;

import com.client.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@RequestMapping("/hello")
@RestController
public class ProviderController {
    @Autowired
    ProviderFeign providerFeign;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return providerFeign.hello(name + "!");
    }
}
