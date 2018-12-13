package com.feign.impl;

import com.feign.UserFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: Input description
 * @author: FangRen
 * @version V2.0
 * @date:
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:.
 */
@Component
public class UserFeignHystrix implements UserFeign {
    
    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "Hello World!";
    }
}
