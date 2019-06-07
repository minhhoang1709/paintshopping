package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.OrderMapper;
import com.paintshopping.model.OrderModel;

@Service
public class OrderService {
	
	@Autowired OrderMapper orderMapper;
	
	public int insertOrder(OrderModel orderModel) {
		return orderMapper.insertOrder(orderModel);
	}
	
	public int updateOrder(OrderModel orderModel) {
		return orderMapper.updateOrder(orderModel);
	}
	
	public int deleteOrder(int orderId) {
		return orderMapper.deleteOrder(orderId);
	}
	
	public OrderModel selectOrder(int orderCartId) {
		return orderMapper.selectOrder(orderCartId);
	}
}