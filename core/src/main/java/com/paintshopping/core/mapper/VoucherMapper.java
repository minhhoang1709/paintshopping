package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.VoucherModel;

@Mapper
public interface VoucherMapper {
	
	int insertVoucher(VoucherModel voucherModel);
	
	int updateVoucher(VoucherModel voucherModel);
	
	int deleteVoucher(int voucherId);
	
	@Select({
		"select * from tblvoucher where voucher_id = #{voucherId, jdbcType=INTEGER}"
	})
	VoucherModel selectVoucherById(@Param("voucherId") int voucherId);
	
	@Select({
		"select * from tblvoucher where voucher_code = #{voucherCode, jdbcType=VARCHAR}"
	})
	VoucherModel selectVoucherByCode(@Param("voucherCode") String voucherCode);
	
	@Select({
		"select count(*) from tblvoucher where voucher_code = #{voucherCode, jdbcType = VARCHAR} and voucher_status = 'ACTIVE'"
	})
	int checkInvalidVoucher(@Param("voucherCode") String voucherCode);
}
