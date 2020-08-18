package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.dao.SpuImagesDao;
import com.atguigu.gulimall.product.entity.SpuImagesEntity;
import com.atguigu.gulimall.product.service.impl.SkuImagesServiceImpl;
import com.atguigu.gulimall.product.service.impl.SpuImagesServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    SpuImagesServiceImpl spuImagesService;
    @Test
    void contextLoads() {
        SpuImagesEntity spuImagesEntity = new SpuImagesEntity();
        spuImagesEntity.setImgName("123123");
        spuImagesEntity.setImgSort(1);
        spuImagesEntity.setImgUrl("11111");
        spuImagesEntity.setSpuId(111L);
        spuImagesService.save(spuImagesEntity);
    }

}
