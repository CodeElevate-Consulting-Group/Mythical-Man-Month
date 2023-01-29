package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//@SpringBootApplication(
//        scanBasePackages = {
//                "com.mycompany.app",
//                "com.mycompany.my-app",
//        }
//)
//@EnableEurekaClient
//@EnableFeignClients(
//        basePackages = "com.mycompany.clients"
//)
//@PropertySources({
//        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
//})
@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}