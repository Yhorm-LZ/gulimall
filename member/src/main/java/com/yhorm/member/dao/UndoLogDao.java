package com.yhorm.member.dao;

import com.yhorm.member.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:31:30
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
