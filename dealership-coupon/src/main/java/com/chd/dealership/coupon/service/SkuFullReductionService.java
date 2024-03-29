package com.chd.dealership.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.to.SkuReductionTo;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:44:09
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveSkuReduction(SkuReductionTo reductionTo);
}

