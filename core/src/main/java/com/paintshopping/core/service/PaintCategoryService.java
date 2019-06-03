package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.PaintCategoryMapper;
import com.paintshopping.model.PaintCategoryModel;

@Service
public class PaintCategoryService {
	
	@Autowired PaintCategoryMapper paintCategoryMapper;
	
	public PaintCategoryModel selectPCById(int paintCategoryId) {
		return paintCategoryMapper.selectPaintCategoryById(paintCategoryId);
	}
	
}
