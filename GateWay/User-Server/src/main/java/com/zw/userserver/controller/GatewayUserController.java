package com.zw.userserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/29 18:42
 **/
@RestController
public class GatewayUserController {

    Logger logger = LoggerFactory.getLogger(GatewayUserController.class);

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}