package com.etc.entity;

import java.util.List;

public class Ordertofood {
//	private int orderid;
//	private int foodid;
	
	private List<Food> foodlist;
	
	private Order order;
	
	


	public List<Food> getFoodlist() {
		return foodlist;
	}


	public void setFoodlist(List<Food> foodlist) {
		this.foodlist = foodlist;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Ordertofood() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Ordertofood [foodlist=" + foodlist + ", order=" + order + "]";
	}


	public Ordertofood(List<Food> foodlist, Order order) {
		super();
		this.foodlist = foodlist;
		this.order = order;
	}
	
	

	

}
