package com.client;

import com.client.impl.ProviderFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@FeignClient(name = "provider-service", fallback = ProviderFeignHystrix.class)
public interface ProviderFeign {

    @RequestMapping("/getUserList")
    public List<String> getUserList();

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
