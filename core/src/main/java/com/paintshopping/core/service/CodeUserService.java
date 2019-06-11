package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.CodeUserMapper;
import com.paintshopping.model.CodeUserModel;

@Service
public class CodeUserService {
	
	@Autowired CodeUserMapper codeUserMapper;
	
	public int insertCodeUser(CodeUserModel codeUserModel) {
		return codeUserMapper.insertCodeUser(codeUserModel);
	}
	
	public int updateCodeUser(CodeUserModel codeUserModel) {
		return codeUserMapper.updateCodeUser(codeUserModel);
	}
	
	public int deleteCodeUser(int codeUserId) {
		return codeUserMapper.deleteCodeUser(codeUserId);
	}
	
	public int selectUsedCode(int codeId, String codeType) {
		return codeUserMapper.selectUsedCode(codeId, codeType);
	}
	
	public CodeUserModel selectVoucher(int codeId, int userId) {
		return codeUserMapper.selectVoucher(codeId, userId);
	}
	
	public int checkUsedVoucher(int codeId, int userId) {
		return codeUserMapper.checkUsedVoucher(codeId, userId);
	}
	
	public int selectVoucherTotal(int codeId, int userId) {
		return codeUserMapper.selectVoucherTotal(codeId, userId);
	}
}
