package com.chd.dealership.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:48:57
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


