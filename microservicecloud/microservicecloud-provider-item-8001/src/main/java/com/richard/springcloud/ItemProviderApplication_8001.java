package com.richard.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class ItemProviderApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication_8001.class,args);
    }
}
