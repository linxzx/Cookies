package com.etc.entity;

import java.util.List;

public class Shop {
		
	private int shopid;
	private String shopname;
	private String shopadd;
	private double sendmoney;
	private int monthsalas;
	private int score;
	
	private List<Collect> collectlist;
	private List<Order> orderlist;
	private List<ShopRedPacket> shopredpacketlist;
	private List<Shopping> shoppinglist;
	private List<Discount> discountlist;
	private List<Comment> commentlist;
	private List<Food> foodlist;
	
	
	
	public List<Food> getFood() {
		return foodlist;
	}

	public void setFood(List<Food> food) {
		this.foodlist = food;
	}

	public List<Collect> getCollect() {
		return collectlist;
	}

	public void setCollect(List<Collect> collect) {
		this.collectlist = collect;
	}

	public List<Order> getOrder() {
		return orderlist;
	}

	public void setOrder(List<Order> order) {
		this.orderlist = order;
	}

	public List<ShopRedPacket> getShopredpacket() {
		return shopredpacketlist;
	}

	public void setShopredpacket(List<ShopRedPacket> shopredpacket) {
		this.shopredpacketlist = shopredpacket;
	}

	public List<Shopping> getShopping() {
		return shoppinglist;
	}

	public void setShopping(List<Shopping> shopping) {
		this.shoppinglist = shopping;
	}

	public List<Discount> getDiscount() {
		return discountlist;
	}

	public void setDiscount(List<Discount> discount) {
		this.discountlist = discount;
	}

	public List<Comment> getComment() {
		return commentlist;
	}

	public void setComment(List<Comment> comment) {
		this.commentlist = comment;
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
		return monthsalas;
	}
	public void setMonthsales(int monthsales) {
		this.monthsalas = monthsales;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Collect> getCollectlist() {
		return collectlist;
	}

	public void setCollectlist(List<Collect> collectlist) {
		this.collectlist = collectlist;
	}

	public List<Order> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Order> orderlist) {
		this.orderlist = orderlist;
	}

	public List<ShopRedPacket> getShopredpacketlist() {
		return shopredpacketlist;
	}

	public void setShopredpacketlist(List<ShopRedPacket> shopredpacketlist) {
		this.shopredpacketlist = shopredpacketlist;
	}

	public List<Shopping> getShoppinglist() {
		return shoppinglist;
	}

	public void setShoppinglist(List<Shopping> shoppinglist) {
		this.shoppinglist = shoppinglist;
	}

	public List<Discount> getDiscountlist() {
		return discountlist;
	}

	public void setDiscountlist(List<Discount> discountlist) {
		this.discountlist = discountlist;
	}

	public List<Comment> getCommentlist() {
		return commentlist;
	}

	public void setCommentlist(List<Comment> commentlist) {
		this.commentlist = commentlist;
	}

	public List<Food> getFoodlist() {
		return foodlist;
	}

	public void setFoodlist(List<Food> foodlist) {
		this.foodlist = foodlist;
	}

	public Shop(int shopid, String shopname, String shopadd, double sendmoney,
			int monthsales) {
		super();
		this.shopid = shopid;
		this.shopname = shopname;
		this.shopadd = shopadd;
		this.sendmoney = sendmoney;
		this.monthsalas = monthsales;
	}

	@Override
	public String toString() {
		return "Shop [shopid=" + shopid + ", shopname=" + shopname
				+ ", shopadd=" + shopadd + ", sendmoney=" + sendmoney
				+ ", monthsales=" + monthsalas + ", score=" + score
				+ ", collectlist=" + collectlist + ", orderlist=" + orderlist
				+ ", shopredpacketlist=" + shopredpacketlist
				+ ", shoppinglist=" + shoppinglist + ", discountlist="
				+ discountlist + ", commentlist=" + commentlist + ", foodlist="
				+ foodlist + "]";
	}


	

	
	
}
