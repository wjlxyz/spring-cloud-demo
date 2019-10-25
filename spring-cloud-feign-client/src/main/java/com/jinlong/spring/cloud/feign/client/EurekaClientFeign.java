package com.jinlong.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jinlong
 * @since 2019-10-24 20:06
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
