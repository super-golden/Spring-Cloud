package com.zw.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/26 18:42
 **/

@RestController
public class SayHelloController {

    @RequestMapping("/greeting/{name}")
    public String sayHi(@PathVariable String name) {
        return String.format("greeting,%s !", name);
    }
}