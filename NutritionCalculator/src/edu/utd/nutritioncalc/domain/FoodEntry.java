package edu.utd.nutritioncalc.domain;

import java.sql.Date;

public class FoodEntry {
	private String entryId;
	private Date entryDate;
	private FoodItem item;
	int quantiy;
	int totalCalroies;
	
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public FoodItem getItem() {
		return item;
	}
	public void setItem(FoodItem item) {
		this.item = item;
	}
	public int getQuantiy() {
		return quantiy;
	}
	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}
	public int getTotalCalroies() {
		return totalCalroies;
	}
	public void setTotalCalroies(int totalCalroies) {
		this.totalCalroies = totalCalroies;
	}
}
