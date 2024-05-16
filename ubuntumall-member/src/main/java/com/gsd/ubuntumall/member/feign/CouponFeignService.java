package com.gsd.ubuntumall.member.feign;

import com.gsd.ubuntumall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author dongdongguo
 * @Date 2024/4/23 14:44
 * @Version 1.0
 */
@FeignClient(value = "ubuntumall-coupen")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/getMemberCoupon")
    public R getMemberCoupon();

}
