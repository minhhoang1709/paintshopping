package com.paintshopping.model;

import com.paintshopping.ref.OrderStatus;

public class OrderModel {
	
	private int orderId;
	private int orderUserId;
	private UserModel orderUser;
	private int orderCartId;
	private String orderCreatedDate;
	private int orderTotal;
	private OrderStatus orderStatus;
	private int orderVoucherId;
	private VoucherModel orderVoucher;

	public OrderModel(int orderId, int orderUserId, UserModel orderUser, int orderCartId,
			String orderCreatedDate, int orderTotal, OrderStatus orderStatus, int orderVoucherId,
			VoucherModel orderVoucher) {
		this.orderId = orderId;
		this.orderUserId = orderUserId;
		this.orderUser = orderUser;
		this.orderCartId = orderCartId;
		this.orderCreatedDate = orderCreatedDate;
		this.orderTotal = orderTotal;
		this.orderStatus = orderStatus;
		this.orderVoucherId = orderVoucherId;
		this.orderVoucher = orderVoucher;
	}

	public OrderModel() {
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}

	public UserModel getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(UserModel orderUser) {
		this.orderUser = orderUser;
	}

	public int getOrderCartId() {
		return orderCartId;
	}

	public void setOrderCartId(int orderCartId) {
		this.orderCartId = orderCartId;
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

	public int getOrderVoucherId() {
		return orderVoucherId;
	}

	public void setOrderVoucherId(int orderVoucherId) {
		this.orderVoucherId = orderVoucherId;
	}

	public VoucherModel getOrderVoucher() {
		return orderVoucher;
	}

	public void setOrderVoucher(VoucherModel orderVoucher) {
		this.orderVoucher = orderVoucher;
	}
}
