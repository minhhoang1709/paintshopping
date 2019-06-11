package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.paintshopping.model.CartModel;

@Mapper
public interface CartMapper {
	
	@Insert({
		"insert into tblcart(cart_user_id, cart_created_date, cart_status) values(#{cartUserId, jdbcType=INTEGER}, #{cartCreatedDate, jdbcType=VARCHAR}, 'PENDING')"
	})
	int insertCart(@Param("cartUserId") int cartUserId, @Param("cartCreatedDate") String cartCreatedDate);
	
	
	@Update({
		"update tblcart",
		"set cart_coupon_id = #{cartCouponId, jdbcType=INTEGER}",
		"where cart_id = #{cartId, jdbcType=INTEGER}"
	})
	int updateCart(@Param("cartCouponId") int cartCouponId, @Param("cartId") int cartId);
	
	int deleteCart(int cartId);
	
	@Select({
		"select count(*) from tblcart",
		"where cart_user_id = #{cartUserId, jdbcType=INTEGER} and cart_status='PENDING'"
	})
	int checkPendingCart(@Param("cartUserId") int cartUserId);
	
	@Select({
		"select cart_id from tblcart",
		"where cart_user_id = #{cartUserId, jdbcType=INTEGER} and cart_status='PENDING'"
	})
	int getPendingCartId(@Param("cartUserId") int cartUserId);
	
	
	CartModel selectCartByUserId(int cartUserId);
	
	CartModel selectCartById(int cartId);
	
	
	
	@Update({
		"update tblcart",
		"set cart_status = 'ORDERED'",
		"where cart_id = #{cartId, jdbcType=INTEGER}"
	})
	int updateCartStatusById(@Param("cartId") int cartId);
	
	@Update({
		"update tblcart",
		"set cart_status = 'ORDERED'",
		"where cart_user_id = #{cartUserId, jdbcType=INTEGER}"
	})
	int updateCartStatusByUserId(@Param("cartUserId") int cartUserId);
	
	@Select({
		"select count(*) from tblcart",
		"where cart_coupon_id =#{cartCouponId, jdbcType=INTEGER}"
	})
	int countUsedCoupon(@Param("cartCouponId") int cartCouponId);
	
	@Select({
		"select count(*) from tblcart",
		"where cart_coupon_id = #{cartCouponId, jdbcType=INTEGER} and cart_user_id = #{cartUserId, jdbcType=INTEGER}"
	})
	
	int countUsedCouponByUserId(@Param("cartCouponId") int cartCouponId, @Param("cartUserId") int cartUserId);
	
	@Select({
		"select count(*) from tblcart",
		"where cart_voucher_id =#{cartVoucherId, jdbcType=INTEGER}"
	})
	int countUsedVoucher(@Param("cartVoucherId") int cartVoucherId);
	
	@Select({
		"select count(*) from tblcart",
		"where cart_voucher_id = #{cartVoucherId, jdbcType=INTEGER} and cart_user_id = #{cartUserId, jdbcType=INTEGER}"
	})
	int countUsedVoucherByUserId(@Param("cartVoucherId") int cartVoucherId, @Param("cartUserId") int cartUserId);
	
	@Select({
		"select cart_coupon_id from tblcart",
		"where cart_id = #{cartId, jdbcType=INTEGER}"
	})
	int selectCouponIdByCartId(int cartId);
}