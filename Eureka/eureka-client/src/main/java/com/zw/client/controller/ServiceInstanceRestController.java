package com.zw.client.controller;

import org.springframework.cloud.client.ServiceInstance;
import  org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:从Eureka Server获取服务实例信息
 * @Author:fei-long-zhang
 * @Date:2019/7/4 14:16
 **/
@RestController
public class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstanceByApplicationName(@PathVariable String applicationName){
       return this.discoveryClient.getInstances(applicationName);

    }


}