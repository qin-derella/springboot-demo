package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.config.UrlConfigs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    UrlConfigs urlConfigs;

    @RequestMapping("/test")
    public String test() {
        return urlConfigs.getQueryUserInfo();
    }
}
