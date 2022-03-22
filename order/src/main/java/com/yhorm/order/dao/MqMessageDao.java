package com.yhorm.order.dao;

import com.yhorm.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:41:05
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
