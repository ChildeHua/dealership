package com.chd.dealership.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:51:27
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

