package com.etc.entity;

import java.util.List;

public class Ordertofood {
	private int orderid;
	private int foodid;
	
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
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public Ordertofood(int orderid, int foodid) {
		super();
		this.orderid = orderid;
		this.foodid = foodid;
	}
	
	@Override
	public String toString() {
		return "Ordertofood [orderid=" + orderid + ", foodid=" + foodid
				+ ", food=" + foodlist + ", order=" + order + "]";
	}

	

}
