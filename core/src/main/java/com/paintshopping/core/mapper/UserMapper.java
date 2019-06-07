package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.paintshopping.model.UserModel;

@Mapper
public interface UserMapper {
	@Select({
		"select ",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address, user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_email=#{user_email,jdbcType=VARCHAR}"
	})
	UserModel selectByUserEmail(@Param("user_email") String userEmail);
	
	@Select({
		"select ",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address , user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_id=#{userId,jdbcType=INTEGER}"
	})
	UserModel selectByUserId(@Param("userId") int userEmail);
	
	@Select({
		"select",
		"user_id, user_name, user_pass, user_fullname, user_gender, user_birthday, user_address, user_phone, user_email, user_created_date, user_updated_date ",
		"from tbluser ",
		"where user_name=#{userName,jdbcType=VARCHAR} and user_pass=#{userPass,jdbcType=VARCHAR}"
	})
	UserModel selectByUserNameAndUserPass(@Param("userName") String userName, @Param("userPass") String userPass);
	
	int insertUser(UserModel userModel);
	
	@Insert({
		"insert ",
		"into tbluser(user_name, user_pass) ",
		"values(#{userName},#{userPass})"
	})
	int registerUser(@Param("userName") String userName, @Param("userPass") String userPass);
	
	@Select({
		"select ",
		"count(*) from tbluser ",
		"where user_name=#{userName}"
	})
	int checkUserName(@Param("userName") String userName);
	int updateProfileWhenRegister(UserModel userModel);
	int updateProfile(UserModel userModel);
	
}
