package com.dubbo.service.impl;

import com.dubbo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author Tang
 * @createTime 2018/4/9 10:52
 **/
@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        System.out.println("demo成功,访问者：" + name);
        return "success";
    }
}
