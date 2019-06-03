package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.PaintDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.PaintCategoryService;
import com.paintshopping.core.service.PaintService;
import com.paintshopping.model.PaintModel;

@Service
public class StoreService {
	
	@Autowired PaintService paintService;
	@Autowired PSModelMapper psModelMaper;
	@Autowired PaintCategoryService paintCategoryService;
	
	public int createNewPaint(PaintDto paintDto, int userId) {
		PaintModel paintModel = new PaintModel();
		paintModel.setPaintName(paintDto.getPaintName());
		paintModel.setPaintColorCode(paintDto.getPaintColorCode());
		paintModel.setPaintBrand(paintDto.getPaintBrand());
		paintModel.setPaintWeight(paintDto.getPaintWeight());
		paintModel.setPaintMade(paintDto.getPaintMade());
		paintModel.setPaintPrice(paintDto.getPaintPrice());
		paintModel.setPaintCategoryId(paintDto.getPaintCategoryId());
		paintModel.setPaintStatus(paintDto.getPaintStatus());
		paintModel.setPaintSupplierId(userId);
		paintModel.setPaintCreatedDate("1");
		paintModel.setPaintUpdatedDate("1");
		return paintService.insertPaint(paintModel);
	}
	
	public int editPaint(PaintDto paintDto) {
		PaintModel paintModel = new PaintModel();
		paintModel.setPaintId(paintDto.getPaintId());
		paintModel.setPaintName(paintDto.getPaintName());
		paintModel.setPaintColorCode(paintDto.getPaintColorCode());
		paintModel.setPaintBrand(paintDto.getPaintBrand());
		paintModel.setPaintWeight(paintDto.getPaintWeight());
		paintModel.setPaintMade(paintDto.getPaintMade());
		paintModel.setPaintPrice(paintDto.getPaintPrice());
		paintModel.setPaintCategoryId(paintDto.getPaintCategoryId());
		paintModel.setPaintStatus(paintDto.getPaintStatus());
		paintModel.setPaintUpdatedDate("1");
		return paintService.updatePaint(paintModel);
	}
	
	public int deletePaint(int paintId) {
		return paintService.deletePaint(paintId);
	}

}
