package com.panshi.hello_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/discoveryMember")
    public List<ServiceInstance> discoveryMember() {
        List<ServiceInstance> instances = discoveryClient.getInstances("hello-api");
        for (ServiceInstance serviceInstance : instances) {
            System.out.println("url:"+serviceInstance.getUri());
        }
        return instances;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello eureka";
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        System.out.println(name);
        return "hello";
    }

}
