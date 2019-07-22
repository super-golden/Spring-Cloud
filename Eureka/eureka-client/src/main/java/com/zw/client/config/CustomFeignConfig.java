package com.zw.client.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;

import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/20 15:26
 **/


@Configuration
public class CustomFeignConfig {

//MappingJackson2CborHttpMessageConverter 是转换Json的底层转换器
    @Bean
    public Decoder feignDecoder() {
        HttpMessageConverter jacksonConverter = new MappingJackson2CborHttpMessageConverter(customObjectMapper());
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);
        return new ResponseEntityDecoder(new SpringDecoder(objectFactory));

    }

    @Bean
    public Encoder feignEncoder(){

        HttpMessageConverter jacksonConverters = new MappingJackson2CborHttpMessageConverter(customObjectMapper());
        ObjectFactory<HttpMessageConverters> objectFactory = () ->new HttpMessageConverters(jacksonConverters);
        return new SpringEncoder(objectFactory);


    }


    public ObjectMapper customObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,true);
        return objectMapper;
    }




}