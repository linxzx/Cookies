package com.etc.entity;

import java.util.List;

public class Rider {
	private int riderid;
	private String ridername;
	private String ridephonenum;
	private String ridesex;
	
	private List<Order> order;
	
	
	
	
	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Rider() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRiderid() {
		return riderid;
	}
	public void setRiderid(int riderid) {
		this.riderid = riderid;
	}
	public String getRidername() {
		return ridername;
	}
	public void setRidername(String ridername) {
		this.ridername = ridername;
	}
	public String getRidephonenum() {
		return ridephonenum;
	}
	public void setRidephonenum(String ridephonenum) {
		this.ridephonenum = ridephonenum;
	}
	public String getRidesex() {
		return ridesex;
	}
	public void setRidesex(String ridesex) {
		this.ridesex = ridesex;
	}
	
	public Rider(int riderid, String ridername, String ridephonenum, String ridesex) {
		super();
		this.riderid = riderid;
		this.ridername = ridername;
		this.ridephonenum = ridephonenum;
		this.ridesex = ridesex;
	}
	
	@Override
	public String toString() {
		return "Rider [riderid=" + riderid + ", ridername=" + ridername
				+ ", ridephonenum=" + ridephonenum + ", ridesex=" + ridesex
				+ ", order=" + order + "]";
	}

	
}
