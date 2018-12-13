package com.client.impl;

import com.client.ProviderFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@Component
public class ProviderFeignHystrix implements ProviderFeign {
    @Override
    public List<String> getUserList() {
        return null;
    }

    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "Hello World!";
    }
}
