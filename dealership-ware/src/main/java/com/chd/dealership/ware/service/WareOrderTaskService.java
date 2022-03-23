package com.chd.dealership.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:54:58
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

