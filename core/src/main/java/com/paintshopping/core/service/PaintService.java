package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.PaintMapper;
import com.paintshopping.model.PaintModel;

@Service
public class PaintService {
	@Autowired PaintMapper paintMapper;
	
	public PaintModel selectPaintById(int paintId) {
		return paintMapper.selectPaintById(paintId);
	}
	
}
