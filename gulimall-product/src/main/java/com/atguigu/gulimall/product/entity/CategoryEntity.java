package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangdongkun
 * @email zhangdongkun819@gmail.com
 * @date 2020-08-16 10:16:21
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long catId;
	/**
	 * 
	 */
	private String name;
	/**
	 * id
	 */
	private Long parentCid;
	/**
	 * 
	 */
	private Integer catLevel;
	/**
	 * [0-1]
	 */
	private Integer showStatus;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private String productUnit;
	/**
	 * 
	 */
	private Integer productCount;
}
