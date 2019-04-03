package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaApplication1.class,args);
    }
}
