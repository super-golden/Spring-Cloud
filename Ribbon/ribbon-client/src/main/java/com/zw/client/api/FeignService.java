package com.zw.client.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(serviceId = "ribbon-service")
public interface FeignService {

     @RequestMapping("/greeting")
     String sayHello();
}
