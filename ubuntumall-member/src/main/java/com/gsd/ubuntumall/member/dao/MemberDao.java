package com.gsd.ubuntumall.member.dao;

import com.gsd.ubuntumall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:04:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
