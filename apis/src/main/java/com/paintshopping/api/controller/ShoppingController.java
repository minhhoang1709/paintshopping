package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.dto.PaintCategoryDto;
import com.paintshopping.api.dto.PaintDto;
import com.paintshopping.api.service.ShoppingService;

@Controller
@RequestMapping(path = "/api")
public class ShoppingController {
	@Autowired ShoppingService shoppingService;
	
	@RequestMapping(path = "/paint", method={ RequestMethod.GET })
	@ResponseBody
	public PaintDto showPaintDetail(int paintId) {
		return shoppingService.showPaintDetail(paintId);
	}
	
	@RequestMapping(path = "/paintcategory", method={ RequestMethod.GET })
	@ResponseBody
	public PaintCategoryDto showPaintCategoryDetail(int paintCategoryId) {
		return shoppingService.showPCDetail(paintCategoryId);
	}
}
