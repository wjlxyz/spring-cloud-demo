package com.jinlong.spring.cloud.feign.client;

import org.springframework.stereotype.Component;

/**
 * @author jinlong
 * @since 2019-10-25 15:32
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi " + name + ", sorry, error!";
    }
}
