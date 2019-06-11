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
	
	public OrderModel selectOrder(int orderId) {
		return orderMapper.selectOrder(orderId);
	}
	
	public int countUsedVoucher(int orderVoucherId) {
		return orderMapper.countUsedVoucher(orderVoucherId);
	}
	
	public int countUsedVoucherPerUser(int orderVoucherId, int orderUserId) {
		return orderMapper.countUsedVoucherPerUser(orderVoucherId, orderUserId);
	}
	
	public OrderModel selectByUserId(int orderUserId) {
		return orderMapper.selectByUserId(orderUserId);
	}
	
	public int checkPendingOrder(int orderUserId) {
		return orderMapper.checkPendingOrder(orderUserId);
	}
	
	public OrderModel selectPendingOrderByCartId(int orderCartId, int orderUserId) {
		return orderMapper.selectPendingOrderByCartId(orderCartId, orderUserId);
	}
	
	public int checkPendingOrderByCartId(int orderCartId, int orderUserId) {
		return orderMapper.checkPendingOrderByCartId(orderCartId, orderUserId);
	}
	
	public int deleteAllPendingOrder(int orderUserId) {
		return orderMapper.deleteAllPendingOrder(orderUserId);
	}
	
	public int setDeleveringOrder(int orderId) {
		return orderMapper.setDeleveringOrder(orderId);
	}
	
	public int setCompletedOrder(int orderId) {
		return orderMapper.setCompletedOrder(orderId);
	}
	
	public int cancelOrder(int orderId) {
		return orderMapper.cancelOrder(orderId);
	}
}
