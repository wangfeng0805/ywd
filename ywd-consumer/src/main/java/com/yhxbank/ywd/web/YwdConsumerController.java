package com.yhxbank.ywd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YwdConsumerController {

    @Autowired
    YwdService ywdService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return ywdService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(ywdService.hello()).append("\n");
        sb.append(ywdService.hello("DIDI")).append("\n");
        sb.append(ywdService.hello("DIDI", 30)).append("\n");
        sb.append(ywdService.hello(new YwdCustomer("DIDI", 30))).append("\n");
        return sb.toString();
    }
}