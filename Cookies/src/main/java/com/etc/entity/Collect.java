package com.etc.entity;

public class Collect {

	private int userid;
	private int shopid;

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
	
	public Collect(int userid, int shopid) {
		super();
		this.userid = userid;
		this.shopid = shopid;
	}
	@Override
	public String toString() {
		return "Collect [userid=" + userid + ", shopid=" + shopid + ", user="
				+ user + ", shop=" + shop + "]";
	}
	
	

}
