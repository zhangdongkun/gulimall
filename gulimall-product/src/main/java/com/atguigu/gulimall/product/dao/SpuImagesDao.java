package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * spu
 * 
 * @author zhangdongkun
 * @email zhangdongkun819@gmail.com
 * @date 2020-08-16 10:16:21
 */
@Mapper
public interface SpuImagesDao extends BaseMapper<SpuImagesEntity> {
    @Select("select * from pms_spu_images sp WHERE sp.spu_id = #{spuId} ")
    List<SpuImagesEntity> selectByBeginDate(Long spuId);

    @Delete("delete from  pms_spu_images where id=#{id}")
     int deleteSpuImage(int id);


    @Update("update pms_spu_images set img_name=#{imgName} where id=#{id}")
     int updateSpuImages(SpuImagesEntity user);
}
