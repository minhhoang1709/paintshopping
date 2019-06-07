package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.VoucherMapper;
import com.paintshopping.model.VoucherModel;

@Service
public class VoucherService {
	
	@Autowired VoucherMapper voucherMapper;
	
	public int insertVoucher(VoucherModel voucherModel) {
		return voucherMapper.insertVoucher(voucherModel);
	}
	
	public int updateVoucher(VoucherModel voucherModel) {
		return voucherMapper.updateVoucher(voucherModel);
	}
	
	public int deleteVoucher(int voucherId) {
		return voucherMapper.deleteVoucher(voucherId);
	}
	
	public VoucherModel selectVoucherById(int voucherId) {
		return voucherMapper.selectVoucherById(voucherId);
	}
	
	public VoucherModel selectVoucherByCode(String voucherCode) {
		return voucherMapper.selectVoucherByCode(voucherCode);
	}
}
