package com.zw.client.controller;

import com.zw.pojo.Person;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/15 18:36
 **/

@RestController()
public interface PersonClicentController {

    public String savePerson(Person person);
}