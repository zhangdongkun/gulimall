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
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long attrId;
	/**
	 * 
	 */
	private String attrName;
	/**
	 * [0-1-]
	 */
	private Integer searchType;
	/**
	 * 
	 */
	private String icon;
	/**
	 * []
	 */
	private String valueSelect;
	/**
	 * [0-1-2-]
	 */
	private Integer attrType;
	/**
	 * [0 - 1 - ]
	 */
	private Long enable;
	/**
	 * 
	 */
	private Long catelogId;
	/**
	 * 0- 1-sku
	 */
	private Integer showDesc;

}
