package com.jinlong.spring.cloud.ribbon.client.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jinlong
 * @since 2019-10-25 09:59
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }
}
