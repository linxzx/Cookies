package com.etc.entity;

import java.util.List;

public class Food {
	private int foodid;
	private String foodname;

	private double foodprice;
	private boolean onsale;
	private String fimgpath;
	private String foodcontent;
	
	private List<Shopping> shoppinglist;
	private List<OrderToFood> ordertofoodlist;
	
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
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
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

	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname
				+ ", foodprice=" + foodprice + ", onsale=" + onsale
				+ ", fimgpath=" + fimgpath + ", foodcontent=" + foodcontent
				+ ", shoppinglist=" + shoppinglist + ", ordertofood="
				+ ordertofoodlist + ", shop=" + shop + "]";
	}

	public Food(int foodid, String foodname, double foodprice, boolean onsale,
			String fimgpath, String foodcontent, List<Shopping> shoppinglist,
			List<OrderToFood> ordertofood, Shop shop) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.onsale = onsale;
		this.fimgpath = fimgpath;
		this.foodcontent = foodcontent;
		this.shoppinglist = shoppinglist;
		this.ordertofoodlist = ordertofood;
		this.shop = shop;
	}


	


}
