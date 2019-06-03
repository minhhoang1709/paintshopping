package com.paintshopping.core.service;

import java.util.List;

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
	
	public List<PaintModel> selectPaintByBrand(String paintBrand){
		return paintMapper.selectByPaintBrand(paintBrand);
	}
	
	public List<PaintModel> selectPaintBySupplierId(int paintSupplierId){
		return paintMapper.selectByPaintSupplierId(paintSupplierId);
	}
	
	public List<PaintModel> selectByPaintCategoryId(int paintCategoryId){
		return paintMapper.selectByPaintCategoryId(paintCategoryId);
	}
	
	public int insertPaint(PaintModel paintModel) {
		return paintMapper.insertPaint(paintModel);
	}
	
	public int updatePaint(PaintModel paintModel) {
		return paintMapper.updatePaint(paintModel);
	}
	
	public int deletePaint(int paintId) {
		return paintMapper.deletePaint(paintId);
	}
}
