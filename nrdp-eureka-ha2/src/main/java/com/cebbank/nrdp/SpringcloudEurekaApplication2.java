package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaApplication2.class,args);
    }
}
