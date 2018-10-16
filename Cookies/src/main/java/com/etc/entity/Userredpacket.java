package com.etc.entity;

public class Userredpacket {
	
	private int uredid;
	private int userid;
	private int sredid;
	
	private Order order;
	private User user;
	private Shopredpacket shopredpacket;
	
	public int getUredid() {
		return uredid;
	}
	public void setUredid(int uredid) {
		this.uredid = uredid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getSredid() {
		return sredid;
	}
	public void setSredid(int sredid) {
		this.sredid = sredid;
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
	public Userredpacket(int uredid, int userid, int sredid) {
		super();
		this.uredid = uredid;
		this.userid = userid;
		this.sredid = sredid;
	}
	
	@Override
	public String toString() {
		return "Userredpacket [uredid=" + uredid + ", userid=" + userid
				+ ", sredid=" + sredid + ", order=" + order + ", user=" + user
				+ ", shopredpacket=" + shopredpacket + "]";
	}
	
	

}
