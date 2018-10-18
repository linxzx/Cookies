package com.etc.entity;

public class Discount {
	private int sdiscid;
	private double discount;
	private double fulldisc;
	private String discontent;
	
	private Shop shop;
	
	
	
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}


	
	
	@Override
	public String toString() {
		return "Discount [sdiscid=" + sdiscid + ", discount=" + discount
				+ ", fulldisc=" + fulldisc + ", discontent=" + discontent
				+ ", shop=" + shop + "]";
	}

	public Discount() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSdiscid() {
		return sdiscid;
	}
	public void setSdiscid(int sdiscid) {
		this.sdiscid = sdiscid;
	}

	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFulldisc() {
		return fulldisc;
	}
	public void setFulldisc(double fulldisc) {
		this.fulldisc = fulldisc;
	}
	public String getDiscontent() {
		return discontent;
	}
	public void setDiscontent(String discontent) {
		this.discontent = discontent;
	}

	public Discount(int sdiscid, double discount, double fulldisc,
			String discontent, Shop shop) {
		super();
		this.sdiscid = sdiscid;
		this.discount = discount;
		this.fulldisc = fulldisc;
		this.discontent = discontent;
		this.shop = shop;
	}

	
}
