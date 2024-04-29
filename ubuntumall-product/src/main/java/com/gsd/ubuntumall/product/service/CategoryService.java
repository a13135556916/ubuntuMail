package com.gsd.ubuntumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:00:08
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

