package com.kumarvir.dev.model;

public class BookRideResponse {
	
	private Driver driverDetail;
	
	private double fare;

	public BookRideResponse() {
		// TODO Auto-generated constructor stub
	}

	public Driver getDriverDetail() {
		return driverDetail;
	}

	public void setDriverDetail(Driver driverDetail) {
		this.driverDetail = driverDetail;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public BookRideResponse(Driver driverDetail, double fare) {
		super();
		this.driverDetail = driverDetail;
		this.fare = fare;
	}

}
