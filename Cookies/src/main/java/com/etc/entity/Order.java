package com.etc.entity;

import java.util.List;

import javax.xml.crypto.Data;

public class Order {
	
	private int orderid;
//	private int userid;		用户
//	private int shopid;		商店
//	private int riderid;	骑手
	private Data ordertime;  //下单时间
	private Data reachtime;  //送达时间
	private double bocost;   //餐盒费用
	private double reachcost;
	
//	private int uredid;  //用户红包id
//	private int sdiscid;//商家优惠id
	
	private User user;
	private UserRedPacket userredpacket;
	private Shop shop;
	private Rider rider;
	private Discount discount;
	
	private List<OrderToFood> oredertofoodlist;
	
	
	
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public List<OrderToFood> getOredertofoodlist() {
		return oredertofoodlist;
	}
	public void setOredertofoodlist(List<OrderToFood> oredertofoodlist) {
		this.oredertofoodlist = oredertofoodlist;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserRedPacket getUserredpacket() {
		return userredpacket;
	}
	public void setUserredpacket(UserRedPacket userredpacket) {
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
	public List<OrderToFood> getOredertofood() {
		return oredertofoodlist;
	}
	public void setOredertofood(List<OrderToFood> oredertofood) {
		this.oredertofoodlist = oredertofood;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}

	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
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
	
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordertime=" + ordertime
				+ ", reachtime=" + reachtime + ", bocost=" + bocost
				+ ", reachcost=" + reachcost + ", user=" + user
				+ ", userredpacket=" + userredpacket + ", shop=" + shop
				+ ", rider=" + rider + ", discount=" + discount
				+ ", oredertofoodlist=" + oredertofoodlist + "]";
	}
	
	public Order(int orderid, Data ordertime, Data reachtime, double bocost,
			double reachcost, User user, UserRedPacket userredpacket,
			Shop shop, Rider rider, Discount discount,
			List<OrderToFood> oredertofoodlist) {
		super();
		this.orderid = orderid;
		this.ordertime = ordertime;
		this.reachtime = reachtime;
		this.bocost = bocost;
		this.reachcost = reachcost;
		this.user = user;
		this.userredpacket = userredpacket;
		this.shop = shop;
		this.rider = rider;
		this.discount = discount;
		this.oredertofoodlist = oredertofoodlist;
	}

	
	

	
	
	
	
}
