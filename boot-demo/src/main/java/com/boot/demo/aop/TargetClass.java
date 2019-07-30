package com.boot.demo.aop;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/30 10:41
 **/


import org.springframework.stereotype.Component;

/**
 * 被代理对象
 */
@Component
public class TargetClass {


    /**
     * 拼接两个字符串
     */
    public String joint(String str1, String str2) {
        return str1 + "+" + str2;
    }

}