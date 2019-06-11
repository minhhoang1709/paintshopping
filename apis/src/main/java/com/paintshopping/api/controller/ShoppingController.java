package com.paintshopping.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.paintshopping.api.dto.ItemsDto;
import com.paintshopping.api.dto.PaintDto;
import com.paintshopping.api.service.BuyingService;
import com.paintshopping.api.service.ShoppingService;

@Controller
@RequestMapping(path = "/api")
public class ShoppingController {
	@Autowired ShoppingService shoppingService;
	@Autowired BuyingService buyingService;
	
	@RequestMapping(path = "/paint", method={ RequestMethod.GET })
	@ResponseBody
	public PaintDto showPaintDetail(int paintId) {
		return shoppingService.showPaintDetail(paintId);
	}
	
	@RequestMapping(path = "/brand/paint", method={ RequestMethod.GET })
	@ResponseBody
	public List<PaintDto> showPaintListByBrand(String paintBrand) {
		return shoppingService.getPaintByBrand(paintBrand);
	}
	
	@RequestMapping(path = "/supplier/paint", method={ RequestMethod.GET })
	@ResponseBody
	public List<PaintDto> showPaintListBySupplierId(int paintSupplierId) {
		return shoppingService.getPaintBySupplierId(paintSupplierId);
	}
	
	@RequestMapping(path = "/category/paint", method={ RequestMethod.GET })
	@ResponseBody
	public List<PaintDto> showPaintListByCategoryId(int paintCategoryId) {
		return shoppingService.getPaintByCategoryId(paintCategoryId);
	}
	
//	@RequestMapping(path="/cartitemslist", method = {RequestMethod.POST})
//	@ResponseBody
//	public int insertListToCart(List<ItemsDto> cartItemsDtoList, int cartUserId) {
//		return buyingService.insertList(cartItemsDtoList, cartUserId);
//	}
}
