package com.gsd.ubuntumall.coupen.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.common.utils.Query;

import com.gsd.ubuntumall.coupen.dao.SeckillSessionDao;
import com.gsd.ubuntumall.coupen.entity.SeckillSessionEntity;
import com.gsd.ubuntumall.coupen.service.SeckillSessionService;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSessionEntity> page = this.page(
                new Query<SeckillSessionEntity>().getPage(params),
                new QueryWrapper<SeckillSessionEntity>()
        );

        return new PageUtils(page);
    }

}