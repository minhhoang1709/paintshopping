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
}
