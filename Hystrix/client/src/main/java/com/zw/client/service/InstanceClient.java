package com.zw.client.service;

import com.zw.client.service.fallback.InstanceClientFallBack;
import com.zw.dto.Instance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hystrix-service",fallback = InstanceClientFallBack.class)
public interface InstanceClient {

     @RequestMapping(value = "/hystrix-service/instance/{serviceId}",method = RequestMethod.GET)
     Instance getInstanceByServiceId(@PathVariable("serviceId") String serviceId);
}
