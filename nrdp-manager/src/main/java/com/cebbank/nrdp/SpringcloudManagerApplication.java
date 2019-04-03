package com.cebbank.nrdp;

import com.cebbank.nrdp.utils.KinitTask;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

//@EnableAdminServer
//@EnableEurekaClient
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//public class SpringcloudManagerApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(SpringcloudManagerApplication.class, args);
//    }
//}

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringcloudManagerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudManagerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringcloudManagerApplication.class);
    }

    @Bean
    public KinitTask kinitTask(){
        return null;
    }
}
