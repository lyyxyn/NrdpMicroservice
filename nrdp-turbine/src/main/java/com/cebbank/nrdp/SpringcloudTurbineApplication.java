package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableEurekaClient
@EnableTurbine
@SpringBootApplication
public class SpringcloudTurbineApplication {

    //http://localhost:8005/turbine.stream
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTurbineApplication.class, args);
    }

}