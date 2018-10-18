package com.etc.entity;

public class Shopping {
//	private int userid;
//	private int shopid;
//	private int foodid;
	private int foodnum;
	
	private User user;
	private Food food;
	private Shop shop;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Shopping() {
		// TODO Auto-generated constructor stub
	}
	

	public int getFoodnum() {
		return foodnum;
	}
	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}

	@Override
	public String toString() {
		return "Shopping [foodnum=" + foodnum + ", user=" + user + ", food="
				+ food + ", shop=" + shop + "]";
	}

	public Shopping(int foodnum, User user, Food food, Shop shop) {
		super();
		this.foodnum = foodnum;
		this.user = user;
		this.food = food;
		this.shop = shop;
	}

	
	
	

}
