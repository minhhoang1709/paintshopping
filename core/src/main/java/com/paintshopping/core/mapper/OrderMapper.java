package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.paintshopping.model.OrderModel;

@Mapper
public interface OrderMapper {
	
	int insertOrder(OrderModel orderModel);
	
	int updateOrder(OrderModel orderModel);
	
	int deleteOrder(int orderId);
	
	OrderModel selectOrder(int orderId);
	
	@Select({
		"select * from tblorder",
		"where order_user_id = #{orderUserId, jdbcType = INTEGER}"
	})
	OrderModel selectByUserId(@Param("orderUserId") int orderUserId);
	
	@Select({
		"select count(*) from tblorder",
		"where order_voucher_id = #{orderVoucherId, jdbcType = INTEGER}"
	})
	int countUsedVoucher(@Param("orderVoucherId") int orderVoucherId);
	
	@Select({
		"select count(*) from tblorder",
		"where order_voucher_id = #{orderVoucherId, jdbcType = INTEGER} and order_user_id = #{orderUserId, jdbcType = INTEGER}"
	})
	int countUsedVoucherPerUser(@Param("orderVoucherId") int orderVoucherId,@Param("orderUserId") int orderUserId);
	
	//CheckPendingCart By UserId
	@Select({
		"select count(*) from tblorder",
		"where order_user_id = #{orderUserId, jdbcType = INTEGER} and order_status = 'PENDING'"
	})
	int checkPendingOrder(@Param("orderUserId") int orderUserId);
	
	//CheckPendingCart By CartId
	@Select({
		"select * from tblorder",
		"where order_cart_id = #{orderCartId, jdbcType = INTEGER} and order_user_id = #{orderUserId, jdbcType = INTEGER} and order_status = 'PENDING'"
	})
	OrderModel selectPendingOrderByCartId(@Param("orderCartId") int orderCartId, @Param("orderUserId") int orderUserId);
	
	@Select({
		"select count(*) from tblorder",
		"where order_cart_id = #{orderCartId, jdbcType = INTEGER} and order_user_id = #{orderUserId, jdbcType = INTEGER} and order_status = 'PENDING'"
	})
	int checkPendingOrderByCartId(@Param("orderCartId") int orderCartId, @Param("orderUserId") int orderUserId);
	
	@Delete({
		"delete from tblorder where order_user_id = #{orderUserId, jdbcType=INTEGER} and order_status = 'PENDING'"
	})
	int deleteAllPendingOrder(@Param("orderUserId") int orderUserId);
	
	
	@Update({
		"update tblorder set order_status = 'COMPLETED' where order_id = #{orderId, jdbcType=INTEGER} and order_status = 'PENDING'"
	})
	int setCompletedOrder(@Param("orderId") int orderId);
	
	@Update({
		"update tblorder set order_status = 'DELIVERING' where order_id = #{orderId, jdbcType=INTEGER} and order_status = 'PENDING'"
	})
	int setDeleveringOrder(@Param("orderId") int orderId);
	
	@Update({
		"update tblorder set order_status = 'CANCELLED' where order_id = #{orderId, jdbcType=INTEGER}"
	})
	int cancelOrder(@Param("orderId") int orderId);
}
