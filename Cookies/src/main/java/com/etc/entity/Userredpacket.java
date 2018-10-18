package com.etc.entity;

public class Userredpacket {
	
	private int uredid;

	
	private Order order;
	private User user;
	private Shopredpacket shopredpacket;
	
	public int getUredid() {
		return uredid;
	}
	public void setUredid(int uredid) {
		this.uredid = uredid;
	}

	
	public Userredpacket() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Shopredpacket getShopredpacket() {
		return shopredpacket;
	}
	public void setShopredpacket(Shopredpacket shopredpacket) {
		this.shopredpacket = shopredpacket;
	}
	@Override
	public String toString() {
		return "Userredpacket [uredid=" + uredid + ", order=" + order
				+ ", user=" + user + ", shopredpacket=" + shopredpacket + "]";
	}
	public Userredpacket(int uredid, Order order, User user,
			Shopredpacket shopredpacket) {
		super();
		this.uredid = uredid;
		this.order = order;
		this.user = user;
		this.shopredpacket = shopredpacket;
	}

	
	

}
