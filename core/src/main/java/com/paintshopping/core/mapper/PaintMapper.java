package com.paintshopping.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.paintshopping.model.PaintModel;

import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaintMapper {
	
	//PaintSelect
	
	PaintModel selectPaintById(@Param("paintId") int paintId);
	
	@Select({
		"select",
		"paint_id, paint_name, paint_color_code, paint_brand, ",
		"paint_weight, paint_made, paint_price, paint_category_id, paint_supplier_id, ",
		"paint_created_date, paint_updated_date, paint_visited, paint_status, paint_is_checked ",
		"from tblpaint where paint_brand=#{paintBrand, jdbcType=VARCHAR}"
		
	})
	List<PaintModel> selectByPaintBrand(@Param("paintBrand") String paintBrand);
	
	@Select({
		"select",
		"paint_id, paint_name, paint_color_code, paint_brand, ",
		"paint_weight, paint_made, paint_price, paint_category_id, paint_supplier_id, ",
		"paint_created_date, paint_updated_date, paint_visited, paint_status, paint_is_checked ",
		"from tblpaint where paint_supplier_id=#{paintSupplierId, jdbcType=INTEGER}"
		
	})
	List<PaintModel> selectByPaintSupplierId(@Param("paintSupplierId") int paintSupplierId);

	@Select({
		"select",
		"paint_id, paint_name, paint_color_code, paint_brand, ",
		"paint_weight, paint_made, paint_price, paint_category_id, paint_supplier_id, ",
		"paint_created_date, paint_updated_date, paint_visited, paint_status, paint_is_checked ",
		"from tblpaint where paint_category_id=#{paintCategoryId, jdbcType=INTEGER}"
		
	})
	List<PaintModel> selectByPaintCategoryId(@Param("paintCategoryId") int paintId);
	
	//PaintManagement
	int insertPaint(PaintModel paintModel);
	
	int updatePaint(PaintModel paintModel);
	
	int deletePaint(int paintId);
	
}
