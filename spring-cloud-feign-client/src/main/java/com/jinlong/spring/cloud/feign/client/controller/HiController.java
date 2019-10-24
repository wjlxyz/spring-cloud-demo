package com.jinlong.spring.cloud.feign.client.controller;

import com.jinlong.spring.cloud.feign.client.service.HiService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong
 * @since 2019-10-24 20:13
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "mason", required = false)String name) {
        return hiService.sayHi(name);
    }
}
