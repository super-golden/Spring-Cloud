package com.boot.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "sms")
@Configuration
@Component
public class SMS {

    private int retryLimitationMinutes;

    private int vaildityMinute;

    private  final  List<String> types = new ArrayList<>();

    public void setRetryLimitationMinutes(int retryLimitationMinutes) {
        this.retryLimitationMinutes = retryLimitationMinutes;
    }

    public int getRetryLimitationMinutes() {
        return retryLimitationMinutes;
    }

    public void setVaildityMinute(int vaildityMinute) {
        this.vaildityMinute = vaildityMinute;
    }

    public int getVaildityMinute() {
        return vaildityMinute;
    }

    public List<String> getTypes() {
        return types;
    }


}


