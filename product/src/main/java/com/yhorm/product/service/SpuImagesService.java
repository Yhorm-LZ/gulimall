package com.yhorm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:37
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

