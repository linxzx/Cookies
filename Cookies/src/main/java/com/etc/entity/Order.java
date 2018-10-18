package com.etc.entity;

import java.util.List;

import javax.xml.crypto.Data;

public class Order {
	
//	private int orderid;
//	private int userid;
//	private int shopid;
//	private int riderid;
	private Data ordertime;  //下单时间
	private Data reachtime;  //送达时间
	private double bocost;   //餐盒费用
	private double reachcost;
	
	private int uredid;  //用户红包id
	private int sdiscid;//商家优惠id
	
	private User user;
	private Userredpacket userredpacket;
	private Shop shop;
	private Rider rider;
	
	private List<Ordertofood> oredertofoodlist;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Userredpacket getUserredpacket() {
		return userredpacket;
	}
	public void setUserredpacket(Userredpacket userredpacket) {
		this.userredpacket = userredpacket;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Rider getRider() {
		return rider;
	}
	public void setRider(Rider rider) {
		this.rider = rider;
	}
	public List<Ordertofood> getOredertofood() {
		return oredertofoodlist;
	}
	public void setOredertofood(List<Ordertofood> oredertofood) {
		this.oredertofoodlist = oredertofood;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Data getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Data ordertime) {
		this.ordertime = ordertime;
	}
	public Data getReachtime() {
		return reachtime;
	}
	public void setReachtime(Data reachtime) {
		this.reachtime = reachtime;
	}
	public double getBocost() {
		return bocost;
	}
	public void setBocost(double bocost) {
		this.bocost = bocost;
	}
	public double getReachcost() {
		return reachcost;
	}
	public void setReachcost(double reachcost) {
		this.reachcost = reachcost;
	}
	public int getUredid() {
		return uredid;
	}
	public void setUredid(int uredid) {
		this.uredid = uredid;
	}
	public int getSdiscid() {
		return sdiscid;
	}
	public void setSdiscid(int sdiscid) {
		this.sdiscid = sdiscid;
	}
	@Override
	public String toString() {
		return "Order [ordertime=" + ordertime + ", reachtime=" + reachtime
				+ ", bocost=" + bocost + ", reachcost=" + reachcost
				+ ", uredid=" + uredid + ", sdiscid=" + sdiscid + ", user="
				+ user + ", userredpacket=" + userredpacket + ", shop=" + shop
				+ ", rider=" + rider + ", oredertofoodlist=" + oredertofoodlist
				+ "]";
	}
	public Order(Data ordertime, Data reachtime, double bocost,
			double reachcost, int uredid, int sdiscid, User user,
			Userredpacket userredpacket, Shop shop, Rider rider,
			List<Ordertofood> oredertofoodlist) {
		super();
		this.ordertime = ordertime;
		this.reachtime = reachtime;
		this.bocost = bocost;
		this.reachcost = reachcost;
		this.uredid = uredid;
		this.sdiscid = sdiscid;
		this.user = user;
		this.userredpacket = userredpacket;
		this.shop = shop;
		this.rider = rider;
		this.oredertofoodlist = oredertofoodlist;
	}

	
	
	
}
