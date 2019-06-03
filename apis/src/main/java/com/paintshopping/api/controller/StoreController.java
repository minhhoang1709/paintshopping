package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.dto.PaintDto;
import com.paintshopping.api.service.ShoppingService;
import com.paintshopping.api.service.StoreService;

@Controller
@RequestMapping(path = "/api")
public class StoreController {
	@Autowired ShoppingService shoppingService;
	@Autowired StoreService storeService;
	
	@RequestMapping(path = "/paint", method={ RequestMethod.POST })
	@ResponseBody
	public int createNewPaint(PaintDto paintDto, int userId) {
		return storeService.createNewPaint(paintDto, userId);
	}
	
	@RequestMapping(path = "/paint", method={ RequestMethod.DELETE })
	@ResponseBody
	public int deletePaint(int paintId) {
		return storeService.deletePaint(paintId);
	}
	
	@RequestMapping(path = "/paint", method={ RequestMethod.PUT })
	@ResponseBody
	public int updatePaint(PaintDto paintDto) {
		return storeService.editPaint(paintDto);
	}
}
