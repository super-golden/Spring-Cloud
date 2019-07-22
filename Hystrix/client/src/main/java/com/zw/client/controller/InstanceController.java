package com.zw.client.controller;

import com.zw.client.service.InstanceService;
import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "rest-template/{serviceId}",method = RequestMethod.GET)
    public Instance getInstanceByServiceIdWithRestTemplate(@PathVariable("serviceId") String serviceId){
        logger.info("Get Instance by serviceId {}",serviceId);
        return instanceService.getInstanceByServiceIdWithRestTemplate(serviceId);

    }

    @RequestMapping(value = "feign/{serviceId}",method = RequestMethod.GET)
    public Instance getInstanceByServiceIdWithFeign(@PathVariable("serviceId") String serviceId){
        logger.info("Get Instance by serviceId {}",serviceId);
        return instanceService.getInstanceByServiceIdWithFeign(serviceId);

    }

}