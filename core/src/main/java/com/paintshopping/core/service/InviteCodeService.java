package com.paintshopping.core.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.InviteCodeMapper;
import com.paintshopping.model.InviteCodeModel;

@Service
public class InviteCodeService {
	
	@Autowired InviteCodeMapper inviteCodeMapper;
	
	public int insertInvite(InviteCodeModel inviteCodeModel) {
		return inviteCodeMapper.insertInvite(inviteCodeModel);
	}
	
	public int updateInvite(InviteCodeModel inviteCodeModel) {
		return inviteCodeMapper.updateInvite(inviteCodeModel);
	}
	
	public int deleteInvite(int inviteId) {
		return inviteCodeMapper.deleteInvite(inviteId);
	}
	
	public InviteCodeModel selectInviteCodeById(int inviteId) {
		return inviteCodeMapper.selectInviteCodeById(inviteId);
	}
	
	public InviteCodeModel selectInviteCodeByCode(String inviteCode) {
		return inviteCodeMapper.selectInviteCodeByCode(inviteCode);
	}
	
	public int checkActiveInviteCode(String inviteCode) {
		return inviteCodeMapper.checkActiveInviteCode(inviteCode);
	}
}
