package com.yhorm.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:47:06
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

