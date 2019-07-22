package com.zw.client.controller;

import com.zw.client.service.InstanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/12 17:38
 **/

@RestController
@RequestMapping("/instance")
public class InstanceController {

    private static final Logger logger = LoggerFactory.getLogger(InstanceController.class);

    @Autowired
    public InstanceService instanceService;



}