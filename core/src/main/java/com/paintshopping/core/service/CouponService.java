package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.CouponMapper;
import com.paintshopping.model.CouponModel;

@Service
public class CouponService {

	@Autowired CouponMapper couponMapper;
	
	public int insertCoupon(CouponModel couponModel) {
		return couponMapper.insertCoupon(couponModel);
	}
	
	public int updateCoupon(CouponModel couponModel) {
		return couponMapper.updateCoupon(couponModel);
	}
	
	public int deleteCoupon(int couponId) {
		return couponMapper.deleteCoupon(couponId);
	}
	
	public CouponModel selectCouponById(int couponId) {
		return couponMapper.selectCouponById(couponId);
	}
	
	public CouponModel selectCouponByCode(String couponCode) {
		return couponMapper.selectCouponByCode(couponCode);
	}
	
	public float selectCouponDiscountPercentByCouponId(int couponId) {
		return couponMapper.selectCouponDiscountPercentByCouponId(couponId);
	}
	
	public int checkInvalidCouponByCode(String couponCode) {
		return couponMapper.checkInvalidCoupon(couponCode);
	}
}
