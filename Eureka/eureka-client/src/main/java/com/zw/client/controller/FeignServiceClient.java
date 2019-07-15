package com.zw.client.controller;


import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(serviceId = "eureka-client-biz")//指定调用的远程服务名
@RequestMapping("/feign-service")
@RestController
public interface FeignServiceClient {


    @RequestMapping(value = "/instance/{serviceId}",method = RequestMethod.GET)
    //@ResponseBody
    public String getInstanceByServiceId(@PathVariable String serviceId);
}
