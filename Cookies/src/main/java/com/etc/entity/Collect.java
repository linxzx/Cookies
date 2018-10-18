package com.etc.entity;

public class Collect {

//	private int userid;
//	private int shopid;

	private User user;
	private Shop shop;
	
	public Collect() {
		// TODO Auto-generated constructor stub
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

//	public int getUserid() {
//		return userid;
//	}
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}
//	public int getShopid() {
//		return shopid;
//	}
//	public void setShopid(int shopid) {
//		this.shopid = shopid;
//	}
	
	
	
	


public Collect(User user, Shop shop) {
	super();
	this.user = user;
	this.shop = shop;
}

@Override
public String toString() {
	return "Collect [user=" + user + ", shop=" + shop + "]";
}
	
	

}
