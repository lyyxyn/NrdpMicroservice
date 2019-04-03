package nrdpclient.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Value("${server.port}")
    String port;

    @RequestMapping("service1-api/hello")
//    public String home(@RequestParam String name) {
//        return "Hi, " + name + ", I am from port:" + port;
//    }
    public String home() {
        return "Hello, service1-api";
    }

}
