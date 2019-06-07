package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.CodeUserModel;

@Mapper
public interface CodeUserMapper {
	int insertCodeUser(CodeUserModel codeUserModel);
	int updateCodeUser(CodeUserModel codeUserModel);
	int deleteCodeUser(int codeUserId);
	
	int deletePendingCode(int codeId, int userId, String codeType);
	
	@Select({
		"select count(*) from tblcodeuser",
		"where code_id = #{codeId, jdbcType=INTEGER} and code_type = #{codeType, jdbcType=VARCHAR}"
	})
	int selectUsedCode(@Param("codeId") int codeId, @Param("codeType") String codeType);

	@Select({
		"select * from tblcodeuser",
		"where code_id = #{codeId, jdbcType=INTEGER} and code_type = VOUCHER and user_id = #{userId, jdbcType=VARCHAR}"
	})
	CodeUserModel selectVoucher(@Param("codeId") int codeId, @Param("userId") int userId);
	
	
	
	
}
