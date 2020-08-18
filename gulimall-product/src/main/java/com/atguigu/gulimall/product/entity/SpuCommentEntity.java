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
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 
	 */
	private String spuName;
	/**
	 * 
	 */
	private String memberNickName;
	/**
	 * 
	 */
	private Integer star;
	/**
	 * ip
	 */
	private String memberIp;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * [0-1-]
	 */
	private Integer showStatus;
	/**
	 * 
	 */
	private String spuAttributes;
	/**
	 * 
	 */
	private Integer likesCount;
	/**
	 * 
	 */
	private Integer replyCount;
	/**
	 * /[json[{type:,url:}]]
	 */
	private String resources;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private String memberIcon;
	/**
	 * [0 - 1 - ]
	 */
	private Integer commentType;

}
