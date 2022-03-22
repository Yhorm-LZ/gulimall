package com.yhorm.member.dao;

import com.yhorm.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:31:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
