package com.chd.dealership.order.dao;

import com.chd.dealership.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:51:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
