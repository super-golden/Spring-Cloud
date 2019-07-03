package com.zw.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description:地址日志过滤器
 * @Author:fei-long-zhang
 * @Date:2019/7/3 10:28
 **/
public class LogFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info(" LogFilter init......");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException,ServletException {

        HttpServletRequest request =(HttpServletRequest) servletRequest;
        logger.info("uri{} iw working.",request.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info(" LogFilter init......");
    }

}