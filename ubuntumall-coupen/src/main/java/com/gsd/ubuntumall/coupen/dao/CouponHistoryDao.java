package com.gsd.ubuntumall.coupen.dao;

import com.gsd.ubuntumall.coupen.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:02:24
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
