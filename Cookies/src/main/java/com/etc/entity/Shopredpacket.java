package com.etc.entity;

import java.util.Date;
import java.util.List;

public class Shopredpacket {
	
	private int sredid;
	private String sredname;
	private double discount;
	private double fulldisc;
	private String redcontent;
	private int shopid;
	private Date rbegintime;
	private Date rendtime;
	
	private Shop shop;
	private List<Userredpacket> userredpacketlist;
	
	
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Userredpacket> getUserredpacket() {
		return userredpacketlist;
	}
	public void setUserredpacket(List<Userredpacket> userredpacket) {
		this.userredpacketlist = userredpacket;
	}
	public Shopredpacket() {
		// TODO Auto-generated constructor stub
	}
	public int getSredid() {
		return sredid;
	}
	public void setSredid(int sredid) {
		this.sredid = sredid;
	}
	public String getSredname() {
		return sredname;
	}
	public void setSredname(String sredname) {
		this.sredname = sredname;
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
	public String getRedcontent() {
		return redcontent;
	}
	public void setRedcontent(String redcontent) {
		this.redcontent = redcontent;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public Date getRbegintime() {
		return rbegintime;
	}
	public void setRbegintime(Date rbegintime) {
		this.rbegintime = rbegintime;
	}
	public Date getRendtime() {
		return rendtime;
	}
	public void setRendtime(Date rendtime) {
		this.rendtime = rendtime;
	}
	public Shopredpacket(int sredid, String sredname, double discount,
			double fulldisc, String redcontent, int shopid, Date rbegintime,
			Date rendtime) {
		super();
		this.sredid = sredid;
		this.sredname = sredname;
		this.discount = discount;
		this.fulldisc = fulldisc;
		this.redcontent = redcontent;
		this.shopid = shopid;
		this.rbegintime = rbegintime;
		this.rendtime = rendtime;
	}
	
	@Override
	public String toString() {
		return "Shopredpacket [sredid=" + sredid + ", sredname=" + sredname
				+ ", discount=" + discount + ", fulldisc=" + fulldisc
				+ ", redcontent=" + redcontent + ", shopid=" + shopid
				+ ", rbegintime=" + rbegintime + ", rendtime=" + rendtime
				+ ", shop=" + shop + ", userredpacket=" + userredpacketlist + "]";
	}
	
	

}
