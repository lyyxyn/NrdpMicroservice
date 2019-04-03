package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@EnableAutoConfiguration
@SpringBootApplication
public class SpringcloudConfigserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigserverApplication.class, args);
    }
}
