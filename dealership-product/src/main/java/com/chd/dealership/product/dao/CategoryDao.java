package com.chd.dealership.product.dao;

import com.chd.dealership.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:53:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
