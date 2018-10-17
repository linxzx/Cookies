package com.etc.entity;

import java.util.List;

public class Food {
	private int foodid;
	private String Foodname;
	private int shopid;
	private double foodprice;
	private boolean onsale;
	private String fimgpath;
	private String foodcontent;
	
	private List<Shopping> shoppinglist;
	private Ordertofood ordertofood;
	private Shop shop;
	
	
	
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public List<Shopping> getShopping() {
		return shoppinglist;
	}

	public void setShopping(List<Shopping> shopping) {
		this.shoppinglist = shopping;
	}

	public Ordertofood getOrdertofood() {
		return ordertofood;
	}

	public void setOrdertofood(Ordertofood ordertofood) {
		this.ordertofood = ordertofood;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	
	public String getFoodname() {
		return Foodname;
	}

	public void setFoodname(String foodname) {
		Foodname = foodname;
	}

	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public double getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}
	public boolean isOnsale() {
		return onsale;
	}
	public void setOnsale(boolean onsale) {
		this.onsale = onsale;
	}
	public String getFimgpath() {
		return fimgpath;
	}
	public void setFimgpath(String fimgpath) {
		this.fimgpath = fimgpath;
	}
	public String getFoodcontent() {
		return foodcontent;
	}
	public void setFoodcontent(String foodcontent) {
		this.foodcontent = foodcontent;
	}
	
	public Food(int foodid,String foodname, int shopid, double foodprice, boolean onsale,
			String fimgpath, String foodcontent) {
		super();
		this.foodid = foodid;
		this.Foodname = foodname;
		this.shopid = shopid;
		this.foodprice = foodprice;
		this.onsale = onsale;
		this.fimgpath = fimgpath;
		this.foodcontent = foodcontent;
	}

	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", Foodname=" + Foodname
				+ ", shopid=" + shopid + ", foodprice=" + foodprice
				+ ", onsale=" + onsale + ", fimgpath=" + fimgpath
				+ ", foodcontent=" + foodcontent + ", shopping=" + shoppinglist
				+ ", ordertofood=" + ordertofood + ", shop=" + shop + "]";
	}


}
