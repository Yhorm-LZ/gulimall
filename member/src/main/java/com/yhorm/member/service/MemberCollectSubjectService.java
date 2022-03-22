package com.yhorm.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhorm.common.utils.PageUtils;
import com.yhorm.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author yhorm
 * @email yhorm-lz@outlook.com
 * @date 2022-03-22 10:31:31
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

