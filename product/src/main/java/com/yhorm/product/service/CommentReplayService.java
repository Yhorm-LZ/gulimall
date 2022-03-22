package com.yhorm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 08:44:38
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

