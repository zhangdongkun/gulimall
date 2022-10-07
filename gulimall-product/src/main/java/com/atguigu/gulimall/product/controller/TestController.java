package com.atguigu.gulimall.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/test")
public class TestController {
    @PostMapping("/hi")
   public String hi( String name) {
        System.out.println("收到一条消息:" + name);

       return "hi: " + name;
   }


}
