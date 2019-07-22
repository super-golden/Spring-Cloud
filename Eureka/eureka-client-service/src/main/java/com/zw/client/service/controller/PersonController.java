package com.zw.client.service.controller;

import com.zw.pojo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/15 18:26
 **/
@RestController
public class PersonController {

    private static  final Logger log = LoggerFactory.getLogger(PersonController.class);

    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String savePerson(@RequestBody Person person){
        log.info("需要存储的person对象：{}",person);
        return "success";
    }
}