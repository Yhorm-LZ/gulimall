package com.yhorm.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:41:04
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

