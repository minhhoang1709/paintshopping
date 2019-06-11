package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.InviteCodeModel;

@Mapper
public interface InviteCodeMapper {
	
	int insertInvite(InviteCodeModel inviteCodeModel);
	
	int updateInvite(InviteCodeModel inviteCodeModel);
	
	int deleteInvite(int inviteId);
	
	@Select({
		"select * from tblinvitecode where invite_id = #{inviteId, jdbcType=INTEGER}"
	})
	InviteCodeModel selectInviteCodeById(@Param("inviteId") int inviteId);
	
	@Select({
		"select * from tblinvitecode where invite_code = #{inviteCode, jdbcType = VARCHAR}"
	})
	InviteCodeModel selectInviteCodeByCode(@Param("inviteCode") String inviteCode);
	
	@Select({
		"select count(*) from tblinvitecode",
		"where invite_code = #{inviteCode, jdbcType = VARCHAR} and invite_status ='ACTIVE'"
	})
	int checkActiveInviteCode(@Param("inviteCode") String inviteCode);
}
