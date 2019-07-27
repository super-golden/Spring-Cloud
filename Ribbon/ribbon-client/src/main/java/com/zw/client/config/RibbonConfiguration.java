package com.zw.client.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/26 17:56
 **/
public class RibbonConfiguration {


    @Autowired
    IClientConfig ribbonClientConfig;

    @Bean
    public IPing ribbonPing(IClientConfig config){
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(IClientConfig config){
        return  new AvailabilityFilteringRule();
    }


}