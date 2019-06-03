package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.PaintCategoryDto;
import com.paintshopping.api.dto.PaintDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.PaintCategoryService;
import com.paintshopping.core.service.PaintService;
import com.paintshopping.model.PaintCategoryModel;
import com.paintshopping.model.PaintModel;

@Service
public class ShoppingService {
	@Autowired PaintService paintService;
	@Autowired PSModelMapper psModelMaper;
	@Autowired PaintCategoryService paintCategoryService;
	
	public PaintDto showPaintDetail(int paintId) {
		PaintModel paintModel = paintService.selectPaintById(paintId);
		return psModelMaper.convertToDto(paintModel);
	}
	
	public PaintCategoryDto showPCDetail(int paintCategoryId) {
		PaintCategoryModel paintCategoryModel = paintCategoryService.selectPCById(paintCategoryId);
		return psModelMaper.convertToDto(paintCategoryModel);
	}
}
