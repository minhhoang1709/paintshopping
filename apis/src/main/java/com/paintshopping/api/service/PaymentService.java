package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.OrderDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.OrderService;

@Service
public class PaymentService {
	@Autowired OrderService orderService;
	@Autowired PSModelMapper pSModelMapper;
	public OrderDto showOrder(int orderCartId) {
		OrderDto orderDto = new OrderDto();
		orderDto = pSModelMapper.convertToDto(orderService.selectOrder(orderCartId));
		return orderDto;
	}
}
