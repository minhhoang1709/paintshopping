package com.paintshopping.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.CartDto;
import com.paintshopping.api.dto.ItemsDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.CartItemsService;
import com.paintshopping.core.service.CartService;
import com.paintshopping.core.service.CouponService;
import com.paintshopping.core.service.InviteCodeService;
import com.paintshopping.core.service.PaintService;
import com.paintshopping.model.CartItemsModel;
import com.paintshopping.model.CartModel;

@Service
public class BuyingService {
	
	@Autowired PSModelMapper psModelMaper;
	@Autowired CartService cartService;
	@Autowired CartItemsService cartItemsService;
	@Autowired PaintService paintService;
	@Autowired CouponService couponService;
	@Autowired InviteCodeService inviteCodeService;
	
	public int getPendingCartId(int cartUserId) {
		
		if(cartService.checkPendingCartByUserId(cartUserId)==1) {
			return cartService.selectPendingCartIdByUserId(cartUserId);
		}else {
			cartService.updateCartStatusByUserId(cartUserId);
			cartService.insertCart(cartUserId);
			return cartService.selectPendingCartIdByUserId(cartUserId);
		}
		
	}
	
	public CartDto getCartByUserId(int cartUserId) {
		CartModel cartModel = cartService.selectCartByUserId(cartUserId);
		
		return psModelMaper.convertToDto(cartModel);
	}
	
	public float getCartDiscountPercent(int cartId) {
		int couponId = cartService.selectCouponIdByCartId(cartId);
		if(couponId!=0) {
			return couponService.selectCouponDiscountPercentByCouponId(couponId);
		}else {
			return 0f;
		}
		
	}
	
	public int addToCart(int cartItemsPaintId,byte cartItemsPaintQuantity, int cartUserId) {
		CartItemsModel cartItemsModel = new CartItemsModel();
		cartItemsModel.setCartPaintId(cartItemsPaintId);
		cartItemsModel.setCartPaintQuantity(cartItemsPaintQuantity);
		cartItemsModel.setCartId(getPendingCartId(cartUserId));
		cartItemsModel.setCartPaint(paintService.selectPaintById(cartItemsPaintId));
		int cartDiscountPercent = (int) getCartDiscountPercent(getPendingCartId(cartUserId));
		cartItemsModel.setCartPaintPrice(cartItemsModel.getCartPaintQuantity()*(cartItemsModel.getCartPaint().getPaintPrice() - cartItemsModel.getCartPaint().getPaintPrice()*cartDiscountPercent/100));
		
		return cartItemsService.insertCartItem(cartItemsModel);
	}
	
	public int removeFromCart(int cartItemsPaintId, int cartUserId) {
		
		int cartId = getPendingCartId(cartUserId);
		return cartItemsService.deleteByCartId(cartId, cartItemsPaintId);
	}
	
	public int updateCartItems(int cartItemsPaintId, byte cartItemsPaintQuantity,int cartUserId) {
		CartItemsModel cartItemsModel = new CartItemsModel();
		cartItemsModel = cartItemsService.selectByPaintId(cartItemsPaintId, getPendingCartId(cartUserId));
		int total = (cartItemsModel.getCartPaintPrice()/cartItemsModel.getCartPaintQuantity())*cartItemsPaintQuantity;
		cartItemsModel.setCartPaintPrice(total);
		cartItemsModel.setCartPaintQuantity(cartItemsPaintQuantity);
		
		return cartItemsService.updateCartItem(cartItemsModel);
	}
	
	public int insertList(List<ItemsDto> cartItemsDtoList, int cartUserId) {
		List<CartItemsModel> insertCartItemsList = new ArrayList<CartItemsModel>();
		//List<CartItemsModel> updateCartItemsList = new ArrayList<CartItemsModel>();
		int cartId = getPendingCartId(cartUserId);
		int cartDiscountPercent = (int) getCartDiscountPercent(cartId);
		for(ItemsDto item:cartItemsDtoList) {
			if(cartItemsService.checkExistPaint(item.getItemPaintId(), cartId)!=0) {
				updateCartItems(item.getItemPaintId(), item.getItemPaintQuantity(), cartUserId);
			}else {
				CartItemsModel cartItemsModelItem = new CartItemsModel();
				cartItemsModelItem.setCartId(cartId);
				cartItemsModelItem.setCartPaintId(item.getItemPaintId());
				cartItemsModelItem.setCartPaintQuantity(item.getItemPaintQuantity());
				cartItemsModelItem.setCartPaintPrice((paintService.selectPaintById(item.getItemPaintId()).getPaintPrice() - paintService.selectPaintById(item.getItemPaintId()).getPaintPrice()*cartDiscountPercent/100)*item.getItemPaintQuantity());
				insertCartItemsList.add(cartItemsModelItem);
			}
			
		}
		return cartItemsService.insertList(insertCartItemsList);
	}
}
