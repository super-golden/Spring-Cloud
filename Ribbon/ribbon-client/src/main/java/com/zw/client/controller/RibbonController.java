package com.zw.client.controller;

import com.zw.client.api.FeignService;
import com.zw.client.config.MyRibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/26 18:01
 **/
@RestController
@RibbonClient(name = "say-hello", configuration = MyRibbonConfiguration.class)
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignService feignService;

    @RequestMapping("/hi")
    public String hi() {
        String greeting = this.restTemplate.getForObject("http://ribbon-service/greeting", String.class);
        return greeting;
    }


    @RequestMapping("/hello")
    public String hello(){
        return feignService.sayHello();
    }
}