package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.paintshopping.model.OrderModel;

@Mapper
public interface OrderMapper {
	
	int insertOrder(OrderModel orderModel);
	
	int updateOrder(OrderModel orderModel);
	
	int deleteOrder(int orderId);
	
	OrderModel selectOrder(int orderCartId);
}
