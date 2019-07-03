package com.zw.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/3 10:34
 **/
public class LogFilterRegistrationBean extends FilterRegistrationBean<LogFilter> {


   public   LogFilterRegistrationBean(){
        super();
        this.setFilter(new LogFilter());
        this.addUrlPatterns("/*");
        this.setName("LogFilter");
        this.setOrder(1);
    }
}