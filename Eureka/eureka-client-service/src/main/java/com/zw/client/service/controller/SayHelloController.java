package com.zw.client.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/4 12:07
 **/
@RestController
public class SayHelloController {

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello,".concat(name).concat("!");
    }
}