package com.paintshopping.api.dto;

import com.paintshopping.ref.PaintStatus;

public class PaintDto {
	private int paintId;
	private String paintName;
	private String paintColorCode;
	private String paintBrand;
	private String paintWeight;
	private String paintMade;
	private int paintPrice;
	private PaintCategoryDto paintCategory;
	private int paintVisited;
	private PaintStatus paintStatus;

	public PaintDto() {
	}

	public PaintDto(int paintId, String paintName, String paintColorCode, String paintBrand, String paintWeight,
			String paintMade, int paintPrice, PaintCategoryDto paintCategory, int paintVisited,
			PaintStatus paintStatus) {
		this.paintId = paintId;
		this.paintName = paintName;
		this.paintColorCode = paintColorCode;
		this.paintBrand = paintBrand;
		this.paintWeight = paintWeight;
		this.paintMade = paintMade;
		this.paintPrice = paintPrice;
		this.paintCategory = paintCategory;
		this.paintVisited = paintVisited;
		this.paintStatus = paintStatus;
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
	public PaintCategoryDto getPaintCategory() {
		return paintCategory;
	}
	public void setPaintCategory(PaintCategoryDto paintCategory) {
		this.paintCategory = paintCategory;
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
}
