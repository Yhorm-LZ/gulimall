package com.yhorm.product.dao;

import com.yhorm.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:37
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
