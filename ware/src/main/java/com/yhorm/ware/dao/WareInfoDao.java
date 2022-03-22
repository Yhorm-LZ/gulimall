package com.yhorm.ware.dao;

import com.yhorm.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:47:06
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
