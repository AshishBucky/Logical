package com.ak.product;

public class Product {
	private int pId;
	private String pName;
	private float unitPrice;
	private int qtyOnHand;
	private String desc;
	private String category;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQtyOnHand() {
		return qtyOnHand;
	}
	public void setQtyOnHand(int qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", unitPrice=" + unitPrice + ", qtyOnHand=" + qtyOnHand
				+ ", desc=" + desc + ", category=" + category + "]";
	}
	
	
}
