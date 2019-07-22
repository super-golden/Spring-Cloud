package com.zw.client.service.fallback;

import com.zw.client.service.InstanceClient;
import com.zw.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:fei-long-zhang
 * @Date:2019/7/22 17:34
 **/
@Component
public class InstanceClientFallBack implements InstanceClient {
    private Logger logger = LoggerFactory.getLogger(InstanceClient.class);

    @Override
    public Instance getInstanceByServiceId(String serviceId) {
        logger.info("Can not get Instance by serviceId:{}",serviceId);
        return new Instance("error","error",0);
    }
}