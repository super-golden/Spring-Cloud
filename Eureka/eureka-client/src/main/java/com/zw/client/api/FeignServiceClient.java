package com.zw.client.api;


import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(serviceId = "eureka-client-service")//指定调用的远程服务名
public interface FeignServiceClient {


     @RequestMapping(value = "/instance/{serviceId}",method = RequestMethod.GET)
     Instance getInstanceByServiceId(@PathVariable String serviceId);


     @RequestMapping(value = "/instance/{serviceId}",method = RequestMethod.DELETE)
     String deleteInstanceByServiceId(@PathVariable("serviceId") String serviceId);

     @RequestMapping(value = "/instance" ,method = RequestMethod.POST)
     String createInstance(@RequestBody Instance instance);

     @RequestMapping(value = "/instance/{serviceId}" ,method = RequestMethod.PUT)
     String updateInstanceByServiceId(@RequestBody Instance instance);



}
