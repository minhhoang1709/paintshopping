package com.paintshopping.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.CartItemsModel;

@Mapper
public interface CartItemsMapper {
	
	int insertCartItem(CartItemsModel cartItemsModel);
	
	int updateCartItem(CartItemsModel cartItemsModel);
	
	int deleteByCartId(int cartId, int cartPaintId);
	
	CartItemsModel selectByPaintId(int cartPaintId, int cartId);
	
	int insertList(List<CartItemsModel> cartItemsList);
	
	@Select({
		"select count(*) from tblcartitems",
		"where cart_coupon_id =#{cartCouponId, jdbcType=INTEGER}"
	})
	int countUsedCoupon(@Param("cartCouponId") int cartCouponId);
	
	@Select({
		"select count(*) from tblcartitems",
		"where cart_coupon_id = #{cartCouponId, jdbcType=INTEGER} and cart_user_id = #{cartUserId, jdbcType=INTEGER}"
	})
	int countUsedCouponByUserId(@Param("cartCouponId") int cartVoucherId, @Param("cartUserId") int cartUserId);
	
	@Select({
		"select count(*) from tblcartitems",
		"where cart_invite_id =#{cartInviteId, jdbcType=INTEGER}"
	})
	int countUsedInvite(@Param("cartInviteId") int cartInviteId);
	
	@Select({
		"select count(*) from tblcartitems",
		"where cart_invite_id = #{cartInviteId, jdbcType=INTEGER} and cart_user_id = #{cartUserId, jdbcType=INTEGER}"
	})
	int countUsedInviteByUserId(@Param("cartInviteId") int cartInviteId, @Param("cartUserId") int cartUserId);
	
	@Select({
		"select count(*) from tblcartitems",
		"where cart_paint_id = #{cartPaintId, jdbcType=INTEGER} and cart_id = #{cartId, jdbcType=INTEGER}"
		})
	int checkExistPaint(@Param("cartPaintId") int cartPaintId, @Param("cartId") int cartId);
	
	}

