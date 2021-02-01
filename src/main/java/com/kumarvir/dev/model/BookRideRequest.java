package com.kumarvir.dev.model;

public class BookRideRequest {
	
	private int userid;
	
	private Location source;
	
	private Location destination;
	
	private RideType ridePrefence;
	
	private VehicleType vehicleType;

	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public Location getSource() {
		return source;
	}



	public void setSource(Location source) {
		this.source = source;
	}



	public Location getDestination() {
		return destination;
	}



	public void setDestination(Location destination) {
		this.destination = destination;
	}



	public RideType getRidePrefence() {
		return ridePrefence;
	}



	public void setRidePrefence(RideType ridePrefence) {
		this.ridePrefence = ridePrefence;
	}



	public VehicleType getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}



	public BookRideRequest() {
		// TODO Auto-generated constructor stub
	}



	public BookRideRequest(int userid, Location source, Location destination, RideType ridePrefence,
			VehicleType vehicleType) {
		super();
		this.userid = userid;
		this.source = source;
		this.destination = destination;
		this.ridePrefence = ridePrefence;
		this.vehicleType = vehicleType;
	}

}
