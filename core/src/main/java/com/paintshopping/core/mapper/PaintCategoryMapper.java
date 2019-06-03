package com.paintshopping.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.paintshopping.model.PaintCategoryModel;

@Mapper
public interface PaintCategoryMapper {
	PaintCategoryModel selectPaintCategoryById(@Param("paintCategoryId") int paintCategoryId);
}
