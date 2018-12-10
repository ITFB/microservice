package com.richard.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication_6003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_6003.class,args);
    }
}
