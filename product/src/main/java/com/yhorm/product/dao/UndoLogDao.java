package com.yhorm.product.dao;

import com.yhorm.product.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:37
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
