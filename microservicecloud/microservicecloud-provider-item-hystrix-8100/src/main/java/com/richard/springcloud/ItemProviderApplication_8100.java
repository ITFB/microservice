package com.richard.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
//@EnableEurekaClient
@EnableCircuitBreaker
public class ItemProviderApplication_8100 {
    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication_8100.class,args);
    }
}
