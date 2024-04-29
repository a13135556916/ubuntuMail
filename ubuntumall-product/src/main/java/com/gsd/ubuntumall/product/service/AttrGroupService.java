package com.gsd.ubuntumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:00:08
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

