package com.panshi.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hello-api")
public interface HelloService {

    @RequestMapping("/hi")
    String hi(@RequestParam("name") String name);
}
