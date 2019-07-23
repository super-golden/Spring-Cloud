package com.zw.client.service.controller;



import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hystrix-service")
public class FeignServiceController {


    private static  final Logger logger = LoggerFactory.getLogger(FeignServiceController.class);

    private static String DEFAULT_SERVICE_ID = "application";
    private static String DEFAULT_HOST = "localhost";
    private static int DEFAULT_PORT = 8080;

    @RequestMapping(value = "/instance/{serviceId}" ,method = RequestMethod.GET)
    public Instance getInstanceByserviceId(@PathVariable String serviceId){

        logger.info("feign service....");
        logger.info("Get Instance by serviceId {}", serviceId);
        return new Instance(serviceId, DEFAULT_HOST, DEFAULT_PORT);
       //  return "OpenFeign-test";
    }
}
