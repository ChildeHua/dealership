package com.chd.dealership.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:53:47
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

