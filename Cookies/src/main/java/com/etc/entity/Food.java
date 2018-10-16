package com.etc.entity;

import java.util.List;

public class Food {
	private int foodid;
	private int shopid;
	private double foodprice;
	private boolean onsale;
	private String fimgpath;
	private String foodcontent;
	
	private List<Shopping> shopping;
	private Ordertofood ordertofood;
	
	
	
	public List<Shopping> getShopping() {
		return shopping;
	}

	public void setShopping(List<Shopping> shopping) {
		this.shopping = shopping;
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
	
	public Food(int foodid, int shopid, double foodprice, boolean onsale,
			String fimgpath, String foodcontent) {
		super();
		this.foodid = foodid;
		this.shopid = shopid;
		this.foodprice = foodprice;
		this.onsale = onsale;
		this.fimgpath = fimgpath;
		this.foodcontent = foodcontent;
	}

	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", shopid=" + shopid + ", foodprice="
				+ foodprice + ", onsale=" + onsale + ", fimgpath=" + fimgpath
				+ ", foodcontent=" + foodcontent + ", shopping=" + shopping
				+ ", ordertofood=" + ordertofood + "]";
	}
	
	

}
