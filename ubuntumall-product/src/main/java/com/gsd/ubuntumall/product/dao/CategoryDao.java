package com.gsd.ubuntumall.product.dao;

import com.gsd.ubuntumall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:00:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
