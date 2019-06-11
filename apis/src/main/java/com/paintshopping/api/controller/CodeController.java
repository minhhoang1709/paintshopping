package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.service.CodeService;

@Controller
@RequestMapping(path="/api")
public class CodeController {
	@Autowired CodeService codeService;
	
	@RequestMapping(path = "/entercoupon", method={ RequestMethod.POST })
	@ResponseBody
	public int enterCoupon(String couponCode, int userId) {
		if(codeService.checkCoupon(couponCode, userId)==true) {
			return codeService.enterCoupon(couponCode, userId);
		}else {
			return 0;
		}
	}
	

	@RequestMapping(path = "/enterinvite", method={ RequestMethod.POST })
	@ResponseBody
	public int enterInvite(String inviteCode, int userId) {
		if(codeService.checkInvite(inviteCode, userId)==true) {
			return codeService.enterInvite(inviteCode, userId);
		}else {
			return 0;
		}
	}
	
	@RequestMapping(path = "/entervoucher", method={ RequestMethod.POST })
	@ResponseBody
	public int enterVoucher(String voucherCode, int userId) {
		if(codeService.checkVoucher(voucherCode, userId)==true) {
			return codeService.enterVoucher(voucherCode, userId);
		}else {
			return 0;
		}
	}
}
