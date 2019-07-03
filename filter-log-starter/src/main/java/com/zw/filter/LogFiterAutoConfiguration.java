package com.zw.filter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/3 10:36
 **/

@Configuration
@ConditionalOnClass({LogFilterRegistrationBean.class,LogFilter.class})
public class LogFiterAutoConfiguration {

    @Bean
    public  LogFilterRegistrationBean logFilterRegistrationBean(){
        return new LogFilterRegistrationBean();
    }
}