package com.chd.dealership.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:48:56
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

