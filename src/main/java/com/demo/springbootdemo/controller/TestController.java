package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.config.UrlConfigs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "测试相关接口")
public class TestController {

    @Resource
    UrlConfigs urlConfigs;

    @GetMapping("/test")
    @ApiOperation("测试【lyq】")
    public String test() {
        return urlConfigs.getQueryUserInfo();
    }
}
