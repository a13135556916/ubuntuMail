package com.gsd.ubuntumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:00:08
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

