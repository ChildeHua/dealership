package com.chd.dealership.member.dao;

import com.chd.dealership.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chd
 * @email 444751770@qq.com
 * @date 2022-03-22 14:48:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
