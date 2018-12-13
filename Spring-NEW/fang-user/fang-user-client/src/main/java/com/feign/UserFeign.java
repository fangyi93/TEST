package com.feign;

import com.feign.impl.UserFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @version V2.0
 * @description: Input description
 * @author: FangRen
 * @date: ${date} ${time}
 * @copyright©2015东方微银网络信息（北京）有限公司
 * @fileName:${file_name}
 */
@FeignClient(name = "fang-user-controller", fallback = UserFeignHystrix.class)
public interface UserFeign {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
