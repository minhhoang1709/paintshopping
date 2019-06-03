package com.paintshopping.api.dto;

public class PaintCategoryDto {
	private int paintCategoryId;
	private String paintCategoryName;
	private String paintCategoryDesciption;
	
	public PaintCategoryDto(int paintCategoryId, String paintCategoryName, String paintCategoryDesciption) {
		this.paintCategoryId = paintCategoryId;
		this.paintCategoryName = paintCategoryName;
		this.paintCategoryDesciption = paintCategoryDesciption;
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
	public String getPaintCategoryDesciption() {
		return paintCategoryDesciption;
	}
	public void setPaintCategoryDesciption(String paintCategoryDesciption) {
		this.paintCategoryDesciption = paintCategoryDesciption;
	}
}
