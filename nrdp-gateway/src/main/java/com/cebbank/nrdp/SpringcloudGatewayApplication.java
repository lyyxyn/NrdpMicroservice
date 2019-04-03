package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringcloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayApplication.class, args);

        //对内只要在eureka中注册的服务之间访问不需要使用zuul网关的，只是对外提供服务时，才需要使用网关。
        //对外提供服务只开通网关的端口的网络访问关系，这样外面只能通过访问网关的的这个端口，来访问服务，并且提供访问规则。符合规则的url才会访问到对应的服务。
    }
}