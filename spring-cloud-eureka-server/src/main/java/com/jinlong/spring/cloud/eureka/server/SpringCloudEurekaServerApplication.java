package com.jinlong.spring.cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jinlong
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class SpringCloudEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class).web(true).run(args);
    }

}
