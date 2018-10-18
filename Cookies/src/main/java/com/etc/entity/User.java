package com.etc.entity;

import java.util.Date;
import java.util.List;

public class User {
	
	private int userID;
	private String account;
	private String password;
	private String alipayaccount;
	private String wechataccount;
	private String userphonenum;
	private Boolean isvip;
	private double money;
	private String usersex;
	private String username;
	private Date viptime;
	
	private List<Address> addresslist;
	private List<UserRedPacket> userredpacketlist;
	private List<Shopping> shoppinglist;
	private List<Order> orderlist;
	private List<Collect> collectlist;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	
	public User( String account, String password, String userphonenum,
			String username,String usersex) {
		super();
		this.account = account;
		this.password = password;
		this.userphonenum = userphonenum;
		this.isvip = false;
		this.money = 0;
		this.username = username;
		this.usersex = usersex;
	}



	public User(int userID, String account, String password,
			String alipayaccount, String wechataccount, String userphonenum,
			Boolean isvip, double money, String username, Date viptime,String usersex) {
		super();
		this.userID = userID;
		this.account = account;
		this.password = password;
		this.alipayaccount = alipayaccount;
		this.wechataccount = wechataccount;
		this.userphonenum = userphonenum;
		this.isvip = isvip;
		this.money = money;
		this.username = username;
		this.viptime = viptime;
		this.usersex = usersex;
	}


	

	public List<Address> getAddresslist() {
		return addresslist;
	}



	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}



	public List<UserRedPacket> getUserredpacketlist() {
		return userredpacketlist;
	}



	public void setUserredpacketlist(List<UserRedPacket> userredpacketlist) {
		this.userredpacketlist = userredpacketlist;
	}



	public List<Shopping> getShoppinglist() {
		return shoppinglist;
	}



	public void setShoppinglist(List<Shopping> shoppinglist) {
		this.shoppinglist = shoppinglist;
	}



	public List<Order> getOrderlist() {
		return orderlist;
	}



	public void setOrderlist(List<Order> orderlist) {
		this.orderlist = orderlist;
	}



	public List<Collect> getCollectlist() {
		return collectlist;
	}



	public void setCollectlist(List<Collect> collectlist) {
		this.collectlist = collectlist;
	}



	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlipayaccount() {
		return alipayaccount;
	}
	public void setAlipayaccount(String alipayaccount) {
		this.alipayaccount = alipayaccount;
	}
	public String getWechataccount() {
		return wechataccount;
	}
	public void setWechataccount(String wechataccount) {
		this.wechataccount = wechataccount;
	}
	public String getUserphonenum() {
		return userphonenum;
	}
	public void setUserphonenum(String userphonenum) {
		this.userphonenum = userphonenum;
	}
	public Boolean getIsvip() {
		return isvip;
	}
	public void setIsvip(Boolean isvip) {
		this.isvip = isvip;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getViptime() {
		return viptime;
	}
	public void setViptime(Date viptime) {
		this.viptime = viptime;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", account=" + account
				+ ", password=" + password + ", alipayaccount=" + alipayaccount
				+ ", wechataccount=" + wechataccount + ", userphonenum="
				+ userphonenum + ", isvip=" + isvip + ", money=" + money
				+ ", username=" + username + ", viptime=" + viptime
				+ ", usersex=" + usersex + ", address=" + addresslist
				+ ", userredpacket=" + userredpacketlist + ", shopping=" + shoppinglist
				+ ", order=" + orderlist + ", collect=" + collectlist + "]";
	}
}
