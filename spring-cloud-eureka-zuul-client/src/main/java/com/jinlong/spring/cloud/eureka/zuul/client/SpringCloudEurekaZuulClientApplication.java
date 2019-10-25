package com.jinlong.spring.cloud.eureka.zuul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
public class SpringCloudEurekaZuulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaZuulClientApplication.class, args);
    }

}
