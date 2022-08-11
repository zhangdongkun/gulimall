package com.atguigu.gulimall.order.contorller;

import com.atguigu.gulimall.order.sentinel.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/config")
@RefreshScope
public class ConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;
    @Value("${localName:}")
    private String userLocalName;
    @Resource
    TestService testService;

    @RequestMapping("/get")
    public Object get() {
        return userLocalName;
    }


    @RequestMapping("/hi")
    public String test(long a) {
        return testService.hello(a);
    }
}
