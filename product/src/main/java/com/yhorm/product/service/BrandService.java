package com.yhorm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

