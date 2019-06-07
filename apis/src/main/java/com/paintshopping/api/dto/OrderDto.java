package com.paintshopping.api.dto;

import com.paintshopping.ref.OrderStatus;

public class OrderDto {
	private UserDto orderUser;
	private String orderCreatedDate;
	private int orderTotal;
	private OrderStatus orderStatus;
	private VoucherDto orderVoucher;

	public OrderDto() {
	}

	public OrderDto(UserDto orderUser, String orderCreatedDate, int orderTotal,
			OrderStatus orderStatus, VoucherDto orderVoucher) {
		this.orderUser = orderUser;
		this.orderCreatedDate = orderCreatedDate;
		this.orderTotal = orderTotal;
		this.orderStatus = orderStatus;
		this.orderVoucher = orderVoucher;
	}

	public UserDto getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(UserDto orderUser) {
		this.orderUser = orderUser;
	}

	public String getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public void setOrderCreatedDate(String orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public VoucherDto getOrderVoucher() {
		return orderVoucher;
	}

	public void setOrderVoucher(VoucherDto orderVoucher) {
		this.orderVoucher = orderVoucher;
	}
}
