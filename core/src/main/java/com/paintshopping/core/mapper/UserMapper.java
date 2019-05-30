package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.*;

import com.paintshopping.model.UserModel;

@Mapper
public interface UserMapper {
	@Select({
		"select ",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address, user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_email=#{user_email,jdbcType=VARCHAR}"
	})
	UserModel findByUserEmail(@Param("user_email") String userEmail);
	
	@Select({
		"select ",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address, user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_id=#{user_id,jdbcType=INT}"
	})
	UserModel findByUserId(@Param("user_id") int userEmail);
	
	@Select({
		"select ",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address, user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_name=#{user_name,jdbcType=VARCHAR} and user_pass=#{user_pass,jdbcType=VARCHAR}"
	})
	UserModel findByUserNameAndPassword(@Param("user_name") String userName, @Param("user_pass") String userPass);
	
	int inserUser(UserModel userModel);
	
	int updateUser(UserModel userModel);
}
