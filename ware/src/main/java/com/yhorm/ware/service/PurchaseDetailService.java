package com.yhorm.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:47:06
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

