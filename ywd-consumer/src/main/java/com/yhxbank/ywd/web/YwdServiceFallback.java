package com.yhxbank.ywd.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/9/16.
 */
@Component
public class YwdServiceFallback implements YwdService {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public YwdCustomer hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new YwdCustomer("未知", 0);
    }

    @Override
    public String hello(@RequestBody YwdCustomer user) {
        return "error";
    }

}
