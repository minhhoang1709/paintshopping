package com.paintshopping.model;

import com.paintshopping.ref.PaintStatus;

public class PaintModel {
	private int paintId;
	private String paintName;
	private String paintColorCode;
	private String paintBrand;
	private String paintWeight;
	private String paintMade;
	private int paintPrice;
	private int paintCategoryId;
	private PaintCategoryModel paintCategory;
	private int paintSupplierId;
	private String paintCreatedDate;
	private String paintUpdatedDate;
	private int paintVisited;
	private PaintStatus paintStatus;
	private boolean isChecked;
	
	public PaintModel() {
	}
	public PaintModel(int paintId, String paintName, String paintColorCode, String paintBrand, String paintWeight,
			String paintMade, int paintPrice, int paintCategoryId, PaintCategoryModel paintCategory,
			int paintSupplierId, String paintCreatedDate, String paintUpdatedDate, int paintVisited,
			PaintStatus paintStatus, boolean isChecked) {
		this.paintId = paintId;
		this.paintName = paintName;
		this.paintColorCode = paintColorCode;
		this.paintBrand = paintBrand;
		this.paintWeight = paintWeight;
		this.paintMade = paintMade;
		this.paintPrice = paintPrice;
		this.paintCategoryId = paintCategoryId;
		this.paintCategory = paintCategory;
		this.paintSupplierId = paintSupplierId;
		this.paintCreatedDate = paintCreatedDate;
		this.paintUpdatedDate = paintUpdatedDate;
		this.paintVisited = paintVisited;
		this.paintStatus = paintStatus;
		this.isChecked = isChecked;
	}
	
	public int getPaintId() {
		return paintId;
	}
	public void setPaintId(int paintId) {
		this.paintId = paintId;
	}
	public String getPaintName() {
		return paintName;
	}
	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}
	public String getPaintColorCode() {
		return paintColorCode;
	}
	public void setPaintColorCode(String paintColorCode) {
		this.paintColorCode = paintColorCode;
	}
	public String getPaintBrand() {
		return paintBrand;
	}
	public void setPaintBrand(String paintBrand) {
		this.paintBrand = paintBrand;
	}
	public String getPaintWeight() {
		return paintWeight;
	}
	public void setPaintWeight(String paintWeight) {
		this.paintWeight = paintWeight;
	}
	public String getPaintMade() {
		return paintMade;
	}
	public void setPaintMade(String paintMade) {
		this.paintMade = paintMade;
	}
	public int getPaintPrice() {
		return paintPrice;
	}
	public void setPaintPrice(int paintPrice) {
		this.paintPrice = paintPrice;
	}
	public int getPaintCategoryId() {
		return paintCategoryId;
	}
	public void setPaintCategoryId(int paintCategoryId) {
		this.paintCategoryId = paintCategoryId;
	}
	public PaintCategoryModel getPaintCategory() {
		return paintCategory;
	}
	public void setPaintCategory(PaintCategoryModel paintCategory) {
		this.paintCategory = paintCategory;
	}
	public int getPaintSupplierId() {
		return paintSupplierId;
	}
	public void setPaintSupplierId(int paintSupplierId) {
		this.paintSupplierId = paintSupplierId;
	}
	public String getPaintCreatedDate() {
		return paintCreatedDate;
	}
	public void setPaintCreatedDate(String paintCreatedDate) {
		this.paintCreatedDate = paintCreatedDate;
	}
	public String getPaintUpdatedDate() {
		return paintUpdatedDate;
	}
	public void setPaintUpdatedDate(String paintUpdatedDate) {
		this.paintUpdatedDate = paintUpdatedDate;
	}
	public int getPaintVisited() {
		return paintVisited;
	}
	public void setPaintVisited(int paintVisited) {
		this.paintVisited = paintVisited;
	}
	public PaintStatus getPaintStatus() {
		return paintStatus;
	}
	public void setPaintStatus(PaintStatus paintStatus) {
		this.paintStatus = paintStatus;
	}
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
