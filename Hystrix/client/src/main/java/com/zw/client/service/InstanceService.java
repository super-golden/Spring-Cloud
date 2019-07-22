package com.zw.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/12 17:17
 **/
@Service
public class InstanceService {


    private static String DEFAULT_SERVICE_ID = "application";

    private static String DEFAULT_HOST = "localhost";

    private static int  DEFAULT_PORT =8080;

    private static Logger logger = LoggerFactory.getLogger(InstanceService.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    InstanceClient instanceClient;


    //@HystrixCommand 注解将该方法纳入到Hystrix的监控中
    @HystrixCommand(fallbackMethod = "instanceInfoGetFail")//指定回滚的方法
    public Instance getInstanceByServiceIdWithRestTemplate(String serviceId){

        Instance instance = restTemplate.getForEntity("http://HYSTRIX-SERVICE/feign-service/instance/{serviceId}",Instance.class,serviceId).getBody();
        return  instance;
    }


    public Instance getInstanceByServiceIdWithFeign(String serviceId){

        Instance instance = instanceClient.getInstanceByServiceId(serviceId);
        return  instance;
    }



    private Instance instanceInfoGetFail(String serviceId){
        logger.info("Cant not get  Instance by serviceId:{}",serviceId);

        return new Instance("error","error",0);

    }
}