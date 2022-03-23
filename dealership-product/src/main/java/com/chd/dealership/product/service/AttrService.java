package com.chd.dealership.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:53:47
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

