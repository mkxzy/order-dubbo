package com.iblotus.orderproviderdubbo.service;

import com.iblotus.orderapidubbo.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderDubboServiceImpl implements HelloDubboService {

    @Override
    public String sayHello(String s) {
        return s;
    }
}
