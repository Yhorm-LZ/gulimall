package com.yhorm.product.dao;

import com.yhorm.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:38
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
