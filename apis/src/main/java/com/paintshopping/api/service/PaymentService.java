package com.paintshopping.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.OrderDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.CartService;
import com.paintshopping.core.service.OrderService;
import com.paintshopping.core.util.PsStringToDate;
import com.paintshopping.model.CartItemsModel;
import com.paintshopping.model.OrderModel;
import com.paintshopping.ref.OrderStatus;

@Service
public class PaymentService {
	@Autowired OrderService orderService;
	@Autowired PSModelMapper pSModelMapper;
	@Autowired PsStringToDate psStringToDate;
	@Autowired CartService cartService;
	public OrderDto showOrder(int orderId) {
		OrderDto orderDto = new OrderDto();
		orderDto = pSModelMapper.convertToDto(orderService.selectOrder(orderId));
		return orderDto;
	}
	
	public OrderModel createNewOrder(int orderCartId, int orderUserId) {
		OrderModel orderModel = new OrderModel();
		orderModel.setOrderCartId(orderCartId);
		orderModel.setOrderUserId(orderUserId);
		Date today = new Date();
		String sToday = psStringToDate.dateToString(today);
		orderModel.setOrderCreatedDate(sToday);
		orderModel.setOrderStatus(OrderStatus.PENDING);
		orderModel.setOrderTotal(getOrderTotal(orderCartId));
		orderService.insertOrder(orderModel);
		return orderModel;
	}
	
	public int getOrderId(int orderCartId, int orderUserId) {
		if(orderService.checkPendingOrder(orderUserId)!=0) {
			if(orderService.checkPendingOrderByCartId(orderCartId, orderUserId)==1) {
				return orderService.selectPendingOrderByCartId(orderCartId, orderUserId).getOrderId();
			}else {
				orderService.deleteAllPendingOrder(orderUserId);
				orderService.insertOrder(createNewOrder(orderCartId, orderUserId));
				return orderService.selectPendingOrderByCartId(orderCartId, orderUserId).getOrderId();
			}
		}else {
			orderService.insertOrder(createNewOrder(orderCartId, orderUserId));
			return orderService.selectPendingOrderByCartId(orderCartId, orderUserId).getOrderId();
		}
	}
	
	public int getOrderTotal(int orderCartId) {
		List<CartItemsModel> cartItemsList = cartService.selectCartById(orderCartId).getCartItems();
		int orderTotal = 0;
		for(CartItemsModel item: cartItemsList) {
			orderTotal += item.getCartPaintPrice();
		}
		return orderTotal;
	}
	
	public int order(int orderId) {
		return orderService.setDeleveringOrder(orderId);
	}
	
	public int updateCartStatus(int cartId) {
		return cartService.updateCartStatusById(cartId);
	}
	
	public int completeOrder(int orderId) {
		return orderService.setCompletedOrder(orderId);
	}
	
	public int cancelOrder(int orderId) {
		return orderService.cancelOrder(orderId);
	}
}
