package com.zw.client.configuration;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/12 17:14
 **/

@Configuration
public class MyConfiguration {


    //注入可以进行负载均衡的RestTemplate
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}