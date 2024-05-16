package com.gsd.ubuntumall.member.dao;

import com.gsd.ubuntumall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:04:20
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
