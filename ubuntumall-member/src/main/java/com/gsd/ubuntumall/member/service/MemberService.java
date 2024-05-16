package com.gsd.ubuntumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsd.ubuntumall.common.utils.PageUtils;
import com.gsd.ubuntumall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author dguo
 * @email dguo1998@gmail.com
 * @date 2024-04-19 16:04:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

