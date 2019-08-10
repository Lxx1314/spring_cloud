package com.panshi.hello_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApiApplication.class, args);
    }

}
