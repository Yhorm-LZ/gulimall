package com.yhorm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:38
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

