package com.paintshopping.api.util;


import org.springframework.stereotype.Component;
import org.modelmapper.*;
import com.paintshopping.model.*;
import com.paintshopping.api.dto.*;


@Component
public class PSModelMapper {
	
	private static final ModelMapper modelMapper = new ModelMapper();
	
	public UserDto convertToDto(UserModel userModel) {
		UserDto userDto = modelMapper.map(userModel, UserDto.class);
		return userDto;
	}
	
	public PaintDto convertToDto(PaintModel paintModel) {
		PaintDto paintDto = modelMapper.map(paintModel, PaintDto.class);
		return paintDto;
	}
	
	public PaintCategoryDto convertToDto(PaintCategoryModel paintCategoryModel) {
		PaintCategoryDto paintCategoryDto = modelMapper.map(paintCategoryModel, PaintCategoryDto.class);
		return paintCategoryDto;
	}
	
	public CartDto convertToDto(CartModel cartModel) {
		CartDto cartDto = modelMapper.map(cartModel, CartDto.class);
		return cartDto;
	}
	
	public OrderDto convertToDto(OrderModel orderModel) {
		OrderDto orderDto = modelMapper.map(orderModel, OrderDto.class);
		return orderDto;
	}
}
