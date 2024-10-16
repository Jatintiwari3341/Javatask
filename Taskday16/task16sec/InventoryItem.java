package com.task16sec;

public class InventoryItem {

	private String itemName;
	private double pricePerUnit;
	private int quantityStock;
	public InventoryItem(String itemName, double pricePerUnit, int quantityStock) {
		super();
		if(itemName==null||itemName.length()==0) {
			System.err.println("Error message indicating invalid item name");
			System.exit(0);
		}
		 if(pricePerUnit<0) {
			System.err.println("Error message indicating invalid price");
			System.exit(0);
		}
		 if(quantityStock<0) {
			System.err.println("Error message indicating invalid quantity");
			System.exit(0);
		}
		else {
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityStock = quantityStock;
		}
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityStock() {
		return quantityStock;
	}
	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}
	
	public double calculateTotalValue() {
		double totalValue=this.pricePerUnit*this.quantityStock;
		return totalValue;
	}
	@Override
	public String toString() {
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityStock="
				+ quantityStock + "]";
	}
	
}
