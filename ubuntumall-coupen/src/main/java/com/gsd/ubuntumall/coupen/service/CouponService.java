package com.gsd.ubuntumall.coupen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.coupen.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:02:24
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

