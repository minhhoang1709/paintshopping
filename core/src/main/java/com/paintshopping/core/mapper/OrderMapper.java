package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.OrderModel;

@Mapper
public interface OrderMapper {
	
	int insertOrder(OrderModel orderModel);
	
	int updateOrder(OrderModel orderModel);
	
	int deleteOrder(int orderId);
	
	OrderModel selectOrder(int orderCartId);
	
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
}
