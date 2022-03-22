package com.yhorm.order.dao;

import com.yhorm.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:41:04
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
