package com.etc.entity;

public class Address {
	private int addid;
	private int userid;
	private String addname;
	private String addphonenum;
	private boolean addsex;
	private String address;
	private String addnum;
	private boolean isdefault;
	
	private User user;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public int getAddid() {
		return addid;
	}
	
	public void setAddid(int addid) {
		this.addid = addid;
	}
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getAddname() {
		return addname;
	}
	
	public void setAddname(String addname) {
		this.addname = addname;
	}
	
	public String getAddphonenum() {
		return addphonenum;
	}
	
	public void setAddphonenum(String addphonenum) {
		this.addphonenum = addphonenum;
	}
	
	public boolean isAddsex() {
		return addsex;
	}
	
	public void setAddsex(boolean addsex) {
		this.addsex = addsex;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddnum() {
		return addnum;
	}
	
	public void setAddnum(String addnum) {
		this.addnum = addnum;
	}
	
	public boolean isIsdefault() {
		return isdefault;
	}
	
	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}
	
	public Address(int addid, int userid, String addname, String addphonenum,
			boolean addsex, String address, String addnum, boolean isdefault) {
		super();
		this.addid = addid;
		this.userid = userid;
		this.addname = addname;
		this.addphonenum = addphonenum;
		this.addsex = addsex;
		this.address = address;
		this.addnum = addnum;
		this.isdefault = isdefault;
	}
	
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", userid=" + userid + ", addname="
				+ addname + ", addphonenum=" + addphonenum + ", addsex=" + addsex
				+ ", address=" + address + ", addnum=" + addnum + ", isdefault="
				+ isdefault + ", user=" + user + "]";
	}



}
