package com.richard.springcloud.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /*
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    */

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
