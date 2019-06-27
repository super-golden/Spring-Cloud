package com.boot.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class LogFilterRegistrationBean extends FilterRegistrationBean<LogFilter> {

      public   LogFilterRegistrationBean(){

          super();

          
      }
}
