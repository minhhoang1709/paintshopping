package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.dto.OrderDto;
import com.paintshopping.api.service.PaymentService;

@Controller
@RequestMapping(path="/api")
public class PaymentController {
	@Autowired PaymentService paymentService;
	
	@RequestMapping(path = "/order", method={ RequestMethod.GET })
	@ResponseBody
	public OrderDto showOrder(int orderCartId) {
		return paymentService.showOrder(orderCartId);
	}
}
