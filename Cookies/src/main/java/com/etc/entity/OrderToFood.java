package com.etc.entity;

import java.util.List;

public class OrderToFood {
//	private int orderid;
//	private int foodid;
	
	private Food food;
	
	private Order order;
	
	



	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public OrderToFood() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "OrderToFood [food=" + food + ", order=" + order + "]";
	}


	public OrderToFood(Food food, Order order) {
		super();
		this.food = food;
		this.order = order;
	}



	
	

	

}
