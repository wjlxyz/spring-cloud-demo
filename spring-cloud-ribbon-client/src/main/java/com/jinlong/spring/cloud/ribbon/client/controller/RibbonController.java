package com.jinlong.spring.cloud.ribbon.client.controller;

import com.jinlong.spring.cloud.ribbon.client.service.RibbonService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong
 * @since 2019-10-25 10:00
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "mason") String name) {
        return ribbonService.hi(name);
    }
}
