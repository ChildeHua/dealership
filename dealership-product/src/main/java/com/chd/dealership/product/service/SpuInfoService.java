package com.chd.dealership.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chd.common.utils.PageUtils;
import com.chd.dealership.product.entity.SpuInfoEntity;
import com.chd.dealership.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:53:46
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);
}

