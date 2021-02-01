package com.kumarvir.dev.model;

public class RideDetail {
	
	private BookRideResponse rideDetail;
	
	private String userName;

	public RideDetail() {
		// TODO Auto-generated constructor stub
	}

	public BookRideResponse getRideDetail() {
		return rideDetail;
	}

	public void setRideDetail(BookRideResponse rideDetail) {
		this.rideDetail = rideDetail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public RideDetail(BookRideResponse rideDetail, String userName) {
		super();
		this.rideDetail = rideDetail;
		this.userName = userName;
	}
}
