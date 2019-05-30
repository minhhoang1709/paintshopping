package com.paintshopping.model;

import java.util.List;

import com.paintshopping.ref.OrderStatus;

public class OrderModel {
	
	private int orderId;
	private int orderUserId;
	private String userFullname;
	private List<CartModel> orderCart;
	private String orderCreatedDate;
	private int orderTotal;
	private String orderPhone;
	private String orderAddress;
	private OrderStatus orderStatus;

	public OrderModel() {
		// TODO Auto-generated constructor stub
	}

	public OrderModel(int orderId, int orderUserId, String userFullname, List<CartModel> orderCart,
			String orderCreatedDate, int orderTotal, String orderPhone, String orderAddress, OrderStatus orderStatus) {
		super();
		this.orderId = orderId;
		this.orderUserId = orderUserId;
		this.userFullname = userFullname;
		this.orderCart = orderCart;
		this.orderCreatedDate = orderCreatedDate;
		this.orderTotal = orderTotal;
		this.orderPhone = orderPhone;
		this.orderAddress = orderAddress;
		this.orderStatus = orderStatus;
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

	public String getUserFullname() {
		return userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public List<CartModel> getOrderCart() {
		return orderCart;
	}

	public void setOrderCart(List<CartModel> orderCart) {
		this.orderCart = orderCart;
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

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
}
