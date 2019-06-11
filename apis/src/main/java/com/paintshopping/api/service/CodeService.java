package com.paintshopping.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.service.CartItemsService;
import com.paintshopping.core.service.CartService;
import com.paintshopping.core.service.CodeUserService;
import com.paintshopping.core.service.CouponService;
import com.paintshopping.core.service.InviteCodeService;
import com.paintshopping.core.service.OrderService;
import com.paintshopping.core.service.VoucherService;
import com.paintshopping.core.util.PsStringToDate;
import com.paintshopping.model.CartItemsModel;
import com.paintshopping.model.CartModel;
import com.paintshopping.model.CodeUserModel;
import com.paintshopping.model.CouponModel;
import com.paintshopping.model.InviteCodeModel;
import com.paintshopping.model.OrderModel;
import com.paintshopping.model.VoucherModel;
import com.paintshopping.ref.CodeType;
import com.paintshopping.ref.CouponType;

@Service
public class CodeService {
	
	@Autowired CouponService couponService;
	@Autowired PsStringToDate psStringToDate;
	@Autowired CartService cartService;
	@Autowired CodeUserService codeUserService;
	@Autowired CartItemsService cartItemsService;
	@Autowired InviteCodeService inviteCodeService;
	@Autowired OrderService orderService;
	@Autowired VoucherService voucherService;
	
	public boolean checkValidDateCoupon(CouponModel couponModel) {
		Date today = new Date();
		Date started = psStringToDate.stringToDate(couponModel.getCouponStartedDate());
		Date exprired = psStringToDate.stringToDate(couponModel.getCouponExpiredDate());
		if(today.compareTo(started)==1&&today.compareTo(exprired)==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkValidDateInvite(InviteCodeModel inviteCodeModel) {
		Date today = new Date();
		Date started = psStringToDate.stringToDate(inviteCodeModel.getInviteStartedDate());
		Date exprired = psStringToDate.stringToDate(inviteCodeModel.getInviteExpiredDate());
		if(today.compareTo(started)==1&&today.compareTo(exprired)==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkValidDateVoucher(VoucherModel voucherModel) {
		Date today = new Date();
		Date started = psStringToDate.stringToDate(voucherModel.getVoucherStartedDate());
		Date exprired = psStringToDate.stringToDate(voucherModel.getVoucherExpiredDate());
		if(today.compareTo(started)==1&&today.compareTo(exprired)==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkUsedCoupon(CouponModel couponModel, int userId) {
		
		if(cartService.countUsedCoupon(couponModel.getCouponId())<couponModel.getCouponAmount()
				&&cartService.countUsedCouponByUserId(couponModel.getCouponId(), userId)<couponModel.getCouponLimitPerUser()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkUsedInvite(InviteCodeModel inviteCodeModel, int userId) {
		
		if(cartItemsService.countUsedInvite(inviteCodeModel.getInviteId())<inviteCodeModel.getInviteAmount()
				&&cartItemsService.countUsedInviteByUserId(inviteCodeModel.getInviteId(), userId) < inviteCodeModel.getInviteLimitPerUser()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkUsedVoucher(VoucherModel voucherModel, int userId) {
		if(orderService.countUsedVoucher(voucherModel.getVoucherId())<voucherModel.getVoucherAmount()
				&&orderService.countUsedVoucherPerUser(voucherModel.getVoucherId(), userId) < voucherModel.getVoucherLimitPerUser()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int selectVoucherTotal(VoucherModel voucherModel, int userId) {
		if(codeUserService.checkUsedVoucher(voucherModel.getVoucherId(), userId)!=0) {
			return codeUserService.selectVoucherTotal(voucherModel.getVoucherId(), userId);
		} else {
			return 0;
		}
	}
	
	public boolean checkVoucherTotal(VoucherModel voucherModel, int userId) {
		if(codeUserService.checkUsedVoucher(voucherModel.getVoucherId(), userId)!=0) {
			if(codeUserService.selectVoucherTotal(voucherModel.getVoucherId(), userId) < voucherModel.getVoucherTotal()) {
				return true;
			}else {
				return false;
			}
		} else {
			return true;
		}
	}
	
	public boolean checkCoupon(String couponCode, int userId) {
		//check invalid coupon
		boolean flag = true;
		if(couponService.checkInvalidCouponByCode(couponCode)==0) {
			flag = false;
		}else {
			CouponModel couponModel = couponService.selectCouponByCode(couponCode);
			flag = checkValidDateCoupon(couponModel);
			if(flag == true) {
				flag = checkUsedCoupon(couponModel, userId);
			}
		}	
		return flag;
	}
	
	public boolean checkInvite(String inviteCode, int userId) {
		boolean flag = true;
		if(inviteCodeService.checkActiveInviteCode(inviteCode)==0) {
			flag = false;
		}else {
			InviteCodeModel inviteCodeModel = inviteCodeService.selectInviteCodeByCode(inviteCode);
			flag = checkValidDateInvite(inviteCodeModel);
			if(flag == true) {
				flag = checkUsedInvite(inviteCodeModel, userId);
			}
		}
		
		return flag;
	}
	
	public boolean checkVoucher(String voucherCode, int userId) {
		boolean flag = true;
		if(voucherService.checkInvalidVoucher(voucherCode)==0) {
			flag = false;
		}else {
			VoucherModel voucherModel = voucherService.selectVoucherByCode(voucherCode);
			flag = checkValidDateVoucher(voucherModel);
			if(flag = true) {
				flag = checkUsedVoucher(voucherModel, userId);
				if(flag = true) {
					flag = checkVoucherTotal(voucherModel, userId);
				}
			}
			
		}
		
		return flag;
	}
	
	public int enterCoupon(String couponCode, int userId) {
		
		CodeUserModel codeUserModel = new CodeUserModel();
		CouponModel couponModel = couponService.selectCouponByCode(couponCode);
		codeUserModel.setCodeId(couponModel.getCouponId());
		codeUserModel.setUserId(userId);
		Date today = new Date();
		String sToday = psStringToDate.dateToString(today);
		codeUserModel.setCodeStartUsingDate(sToday);
		codeUserModel.setCodeLastUsingDate(sToday);
		codeUserModel.setCodePending(true);
		codeUserModel.setCodeType(CodeType.COUPON);
		CartModel cartModel = cartService.selectCartByUserId(userId);
		if(couponModel.getCouponType()==CouponType.CART) {
			
			cartService.updateCart(couponModel.getCouponId(), cartModel.getCartId());
			for(CartItemsModel item:cartModel.getCartItems()) {
				int newPrice = (int) (item.getCartPaintPrice() - item.getCartPaintPrice()*couponModel.getCouponDiscountPercent()/100);
				item.setCartPaintPrice(newPrice);
				cartItemsService.updateCartItem(item);
			}
			
		}else if(couponModel.getCouponType()==CouponType.PRODUCT) {
			CartItemsModel cartItemsModel =  cartItemsService.selectByPaintId(couponModel.getCouponTypeId(), cartModel.getCartId());
			cartItemsModel.setCartItemsCouponId(couponModel.getCouponId());
			int newPrice = (int) (cartItemsModel.getCartPaintPrice()-cartItemsModel.getCartPaintPrice()*couponModel.getCouponDiscountPercent()/100);
			cartItemsModel.setCartPaintPrice(newPrice);
		}
		return codeUserService.insertCodeUser(codeUserModel);
	}
	
	public int enterInvite(String inviteCode, int userId) {
		CodeUserModel codeUserModel = new CodeUserModel();
		int cartId = cartService.selectCartByUserId(userId).getCartId();
		InviteCodeModel inviteCodeModel = inviteCodeService.selectInviteCodeByCode(inviteCode);
		codeUserModel.setCodeId(inviteCodeModel.getInviteId());
		codeUserModel.setCodeUserId(userId);
		Date today = new Date();
		String sToday = psStringToDate.dateToString(today);
		codeUserModel.setCodeStartUsingDate(sToday);
		codeUserModel.setCodeLastUsingDate(sToday);
		codeUserModel.setCodePending(true);
		codeUserModel.setCodeType(CodeType.INVITE);
		if(cartItemsService.checkExistPaint(inviteCodeModel.getInviteProductId(), cartId)!=0) {
			CartItemsModel cartItemsModel = cartItemsService.selectByPaintId(inviteCodeModel.getInviteProductId(), cartId);
			cartItemsModel.setCartItemsInviteId(inviteCodeModel.getInviteId());
			cartItemsModel.setCartPaintPrice(0);
			cartItemsService.updateCartItem(cartItemsModel);
		}else {
			CartItemsModel cartItemsModel = new CartItemsModel();
			cartItemsModel.setCartId(cartId);
			cartItemsModel.setCartItemsCreatedDate(sToday);
			cartItemsModel.setCartItemsId(inviteCodeModel.getInviteProductId());
			cartItemsModel.setCartPaintQuantity(inviteCodeModel.getInviteAmount());
			cartItemsModel.setCartItemsInviteId(inviteCodeModel.getInviteId());
			cartItemsModel.setCartPaintPrice(0);
			cartItemsModel.setCartPaintId(inviteCodeModel.getInviteProductId());
			cartItemsService.insertCartItem(cartItemsModel);
		}
		
		return codeUserService.insertCodeUser(codeUserModel);
	}
	
	public int enterVoucher(String voucherCode, int userId) {
		Date today = new Date();
		String sToday = psStringToDate.dateToString(today);
		
		OrderModel orderModel = orderService.selectByUserId(userId);
		
		VoucherModel voucherModel = voucherService.selectVoucherByCode(voucherCode);
		orderModel.setOrderVoucherId(voucherModel.getVoucherId());
		
		if(codeUserService.checkUsedVoucher(voucherModel.getVoucherId(), userId)!=0) {
			CodeUserModel codeUserModel = codeUserService.selectVoucher(voucherModel.getVoucherId(), userId);
			codeUserModel.setCodeLastUsingDate(sToday);
			int total = orderModel.getOrderTotal() - voucherModel.getVoucherTotal() + codeUserModel.getVoucherUsedTotal();
			if(total>0) {
				codeUserModel.setVoucherUsedTotal(voucherModel.getVoucherTotal());
				orderModel.setOrderTotal(total);
			}else {
				codeUserModel.setVoucherUsedTotal(codeUserModel.getVoucherUsedTotal()+orderModel.getOrderTotal());
				orderModel.setOrderTotal(0);
			}
			codeUserService.updateCodeUser(codeUserModel);
		}else {
			CodeUserModel codeUserModel = new CodeUserModel();
			codeUserModel.setCodeId(voucherModel.getVoucherId());
			codeUserModel.setCodeStartUsingDate(sToday);
			codeUserModel.setCodeLastUsingDate(sToday);
			codeUserModel.setCodePending(true);
			codeUserModel.setUserId(userId);
			codeUserModel.setCodeType(CodeType.VOUCHER);
			int total = orderModel.getOrderTotal() - voucherModel.getVoucherTotal();
			if(total>0) {
				codeUserModel.setVoucherUsedTotal(voucherModel.getVoucherTotal());
				
				orderModel.setOrderTotal(total);
			}else {
				codeUserModel.setVoucherUsedTotal(orderModel.getOrderTotal());
				orderModel.setOrderTotal(0);
			}
			codeUserService.insertCodeUser(codeUserModel);
		}
		
		return orderService.updateOrder(orderModel);
	}
}
