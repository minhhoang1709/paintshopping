package com.paintshopping.api.dto;

public class PaintCategoryDto {
	private int paintCategoryId;
	private String paintCategoryName;
	
	public PaintCategoryDto(int paintCategoryId, String paintCategoryName) {
		this.paintCategoryId = paintCategoryId;
		this.paintCategoryName = paintCategoryName;
	}
	
	public PaintCategoryDto() {
	}

	public int getPaintCategoryId() {
		return paintCategoryId;
	}
	public void setPaintCategoryId(int paintCategoryId) {
		this.paintCategoryId = paintCategoryId;
	}
	public String getPaintCategoryName() {
		return paintCategoryName;
	}
	public void setPaintCategoryName(String paintCategoryName) {
		this.paintCategoryName = paintCategoryName;
	}
}
