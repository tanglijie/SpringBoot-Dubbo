package com.dubbo.controller;


import com.dubbo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tang
 * @createTime 2018/4/9 11:16
 **/
@RestController
public class Demo{

    @Resource
    DemoService demoService;

    @RequestMapping("test")
    public void aaaaa() {
        String s = demoService.sayHello("aa");
        System.out.println("======================================>>>>>>>>>>>>>>>>"+s);
    }
}
