package com.zw.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/26 18:01
 **/
@RestController
//@RibbonClient(name = "say-hello", configuration = RibbonConfiguration.class)
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "samson") String name) {
        String greeting = this.restTemplate.getForObject("http://ribbon-service/greeting/{name}", String.class, name);
        return greeting;
    }

}