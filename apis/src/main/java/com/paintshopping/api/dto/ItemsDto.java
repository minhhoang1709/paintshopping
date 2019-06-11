package com.paintshopping.api.dto;

public class ItemsDto {
	private int itemPaintId;
	private byte itemPaintQuantity;

	public ItemsDto() {
	}

	public ItemsDto(int itemPaintId, byte itemPaintQuantity) {
		this.itemPaintId = itemPaintId;
		this.itemPaintQuantity = itemPaintQuantity;
	}

	public int getItemPaintId() {
		return itemPaintId;
	}

	public void setItemPaintId(int itemPaintId) {
		this.itemPaintId = itemPaintId;
	}

	public byte getItemPaintQuantity() {
		return itemPaintQuantity;
	}

	public void setItemPaintQuantity(byte itemPaintQuantity) {
		this.itemPaintQuantity = itemPaintQuantity;
	}
}
