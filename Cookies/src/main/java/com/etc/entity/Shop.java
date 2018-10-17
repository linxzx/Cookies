package com.etc.entity;

import java.util.List;

public class Shop {
		
	private int shopid;
	private String shopname;
	private String shopadd;
	private double sendmoney;
	private int monthsales;
	
	private List<Collect> collect;
	private List<Order> order;
	private List<Shopredpacket> shopredpacket;
	private List<Shopping> shopping;
	private List<Discount> discount;
	private List<Comment> comment;
	private List<Food> food;
	
	
	
	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public List<Collect> getCollect() {
		return collect;
	}

	public void setCollect(List<Collect> collect) {
		this.collect = collect;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public List<Shopredpacket> getShopredpacket() {
		return shopredpacket;
	}

	public void setShopredpacket(List<Shopredpacket> shopredpacket) {
		this.shopredpacket = shopredpacket;
	}

	public List<Shopping> getShopping() {
		return shopping;
	}

	public void setShopping(List<Shopping> shopping) {
		this.shopping = shopping;
	}

	public List<Discount> getDiscount() {
		return discount;
	}

	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopadd() {
		return shopadd;
	}
	public void setShopadd(String shopadd) {
		this.shopadd = shopadd;
	}
	public double getSendmoney() {
		return sendmoney;
	}
	public void setSendmoney(double sendmoney) {
		this.sendmoney = sendmoney;
	}
	public int getMonthsales() {
		return monthsales;
	}
	public void setMonthsales(int monthsales) {
		this.monthsales = monthsales;
	}
	public Shop(int shopid, String shopname, String shopadd, double sendmoney,
			int monthsales) {
		super();
		this.shopid = shopid;
		this.shopname = shopname;
		this.shopadd = shopadd;
		this.sendmoney = sendmoney;
		this.monthsales = monthsales;
	}

	@Override
	public String toString() {
		return "Shop [shopid=" + shopid + ", shopname=" + shopname
				+ ", shopadd=" + shopadd + ", sendmoney=" + sendmoney
				+ ", monthsales=" + monthsales + ", collect=" + collect
				+ ", order=" + order + ", shopredpacket=" + shopredpacket
				+ ", shopping=" + shopping + ", discount=" + discount
				+ ", comment=" + comment + ", food=" + food + "]";
	}
	

	
	
}
