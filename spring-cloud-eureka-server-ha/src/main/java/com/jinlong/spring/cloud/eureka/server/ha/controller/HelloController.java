package com.jinlong.spring.cloud.eureka.server.ha.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong
 * @since 2019-10-23 10:03
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    // just for testing @LoadBalance with Ribbon
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String index(String name) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        log.info("/hello, host:" + instance.getHost() + ", service_id: " + instance.getServiceId());
        return "Hello" + name + " from " + instance.getHost() + ":" + instance.getPort();
    }

}
