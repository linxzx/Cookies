package com.etc.entity;

import java.util.Date;

public class Comment {
	private int comid;
	private int shopid;
	private String comcontent;
	private int userid;
	private Date comtime;
	private int comstar;
	private String comimgpath;
	
	private Shop shop;
	
	
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getComcontent() {
		return comcontent;
	}
	public void setComcontent(String comcontent) {
		this.comcontent = comcontent;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getComtime() {
		return comtime;
	}
	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}
	public int getComstar() {
		return comstar;
	}
	public void setComstar(int comstar) {
		this.comstar = comstar;
	}
	public String getComimgpath() {
		return comimgpath;
	}
	public void setComimgpath(String comimgpath) {
		this.comimgpath = comimgpath;
	}
	public Comment(int comid, int shopid, String comcontent, int userid,
			Date comtime, int comstar, String comimgpath) {
		super();
		this.comid = comid;
		this.shopid = shopid;
		this.comcontent = comcontent;
		this.userid = userid;
		this.comtime = comtime;
		this.comstar = comstar;
		this.comimgpath = comimgpath;
	}
	
	@Override
	public String toString() {
		return "Comment [comid=" + comid + ", shopid=" + shopid + ", comcontent="
				+ comcontent + ", userid=" + userid + ", comtime=" + comtime
				+ ", comstar=" + comstar + ", comimgpath=" + comimgpath + ", shop="
				+ shop + "]";
	}


}
