package com.panshi.feignconsumer.controller;

import com.panshi.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConusmerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/call")
    public String helloConsumer(String name){
        System.out.println(name);
        return helloService.hi(name);
    }

}
