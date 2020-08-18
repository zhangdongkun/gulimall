package com.atguigu.gulimall.product;

import com.alibaba.fastjson.JSON;
import com.atguigu.gulimall.product.dao.SpuImagesDao;
import com.atguigu.gulimall.product.entity.SpuImagesEntity;
import com.atguigu.gulimall.product.service.impl.SkuImagesServiceImpl;
import com.atguigu.gulimall.product.service.impl.SpuImagesServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    SpuImagesServiceImpl spuImagesService;
    @Autowired
    SpuImagesDao spuImagesDao;
    @Test
    void contextLoads() {
        SpuImagesEntity spuImagesEntity = new SpuImagesEntity();
        spuImagesEntity.setImgName("123123");
        spuImagesEntity.setImgSort(1);
        spuImagesEntity.setImgUrl("11111");
        spuImagesEntity.setSpuId(111L);
        spuImagesService.save(spuImagesEntity);
    }
    @Test
    void testFind() {
        List<SpuImagesEntity>  list = spuImagesDao.selectByBeginDate(111L);
        System.out.println(JSON.toJSONString(list));
    }
    @Test
    void updateTest() {
        SpuImagesEntity spuImagesEntity =  spuImagesDao.selectById(1);
        spuImagesEntity.setImgName("耳机1000");
        spuImagesEntity.setDefaultImg(66);
        spuImagesEntity.setImgSort(5);
        spuImagesDao.updateSpuImages(spuImagesEntity);
    }


}
