package com.etc.entity;

import java.util.Date;

public class Comment {
	private int comid;
//	private int shopid;
	private String comcontent;
//	private int userid;
	private Date comtime;
	private int comstar;
	private String comimgpath;
	
	private Shop shop;
	private User user;
	
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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

	public String getComcontent() {
		return comcontent;
	}
	public void setComcontent(String comcontent) {
		this.comcontent = comcontent;
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
	public Comment(int comid, String comcontent, Date comtime,
			int comstar, String comimgpath, Shop shop) {
		super();
		this.comid = comid;
		this.comcontent = comcontent;
		this.comtime = comtime;
		this.comstar = comstar;
		this.comimgpath = comimgpath;
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Comment [comid=" + comid + ", comcontent=" + comcontent
				+ ", comtime=" + comtime + ", comstar=" + comstar
				+ ", comimgpath=" + comimgpath + ", shop=" + shop + ", user="
				+ user + "]";
	}


	


}
