package com.richard.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ItemConsumerApplication_Fegin {
    public static void main(String[] args) {
        SpringApplication.run(ItemConsumerApplication_Fegin.class,args);
    }
}
