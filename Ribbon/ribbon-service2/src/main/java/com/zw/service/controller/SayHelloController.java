package com.zw.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/26 18:42
 **/

@RestController
public class SayHelloController {

    @RequestMapping("/greeting")
    public String sayHi() {
        return "ribbon-service-2";
    }
}