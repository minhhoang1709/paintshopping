package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.CouponModel;

@Mapper
public interface CouponMapper {
	
	int insertCoupon(CouponModel couponModel);
	
	int updateCoupon(CouponModel couponModel);
	
	int deleteCoupon(int couponId);
	
	@Select({
		"select * from tblcoupon where coupon_id = #{couponId, jdbcType = INTEGER}"
	})
	CouponModel selectCouponById(@Param("couponId") int couponId);
	
	@Select({
		"select * from tblcoupon where coupon_code = #{couponCode, jdbcType = VARCHAR}"
	})
	CouponModel selectCouponByCode(@Param("couponcode") String couponCode);
}
