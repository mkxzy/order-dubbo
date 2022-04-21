package com.example.orderconsumerdubbo.controller;

import com.iblotus.orderapidubbo.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {

    @Reference(check = false)
    private HelloDubboService helloDubboService;

    @GetMapping("/")
    public String getOrder() {
        return helloDubboService.sayHello("Hello, World");
    }
}
