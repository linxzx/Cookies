package com.etc.entity;

public class Shopping {
	private int userid;
	private int shopid;
	private int foodid;
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
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public int getFoodnum() {
		return foodnum;
	}
	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}
	public Shopping(int userid, int shopid, int foodid, int foodnum) {
		super();
		this.userid = userid;
		this.shopid = shopid;
		this.foodid = foodid;
		this.foodnum = foodnum;
	}

	@Override
	public String toString() {
		return "Shopping [userid=" + userid + ", shopid=" + shopid
				+ ", foodid=" + foodid + ", foodnum=" + foodnum + ", user="
				+ user + ", food=" + food + ", shop=" + shop + "]";
	}
	
	

}
