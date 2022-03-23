package com.chd.dealership.member.feign;

import com.chd.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//告诉spring cloud这个接口是一个声明式的远程调用，要调用coupon服务，再去调用coupon服务/coupon/coupon/member/list对应的方法
@FeignClient("dealership-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();//得到一个R对象
}