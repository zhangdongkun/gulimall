package com.atguigu.gulimall.order.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "gualimall-product")
public interface ProductServiceClient {

    @PostMapping(value ="/product/test/hi",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String hi(@RequestParam("name")  String name);

}
