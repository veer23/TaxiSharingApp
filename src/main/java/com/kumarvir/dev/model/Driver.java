package com.kumarvir.dev.model;

public class Driver {
	private int Id;
	
    private Location location;
    
    private VehicleType vehicleType;
    
    private RideType rideType;
    
    public Driver() {
    	
    }

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public VehicleType getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}



	public RideType getRideType() {
		return rideType;
	}

	public void setRideType(RideType rideType) {
		this.rideType = rideType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Driver(int id, Location location, VehicleType vehicleType, RideType rideType) {
		super();
		Id = id;
		this.location = location;
		this.vehicleType = vehicleType;
		this.rideType = rideType;
	}

	@Override
	public String toString() {
		return "Driver [Id=" + Id + ", location=" + location + ", vehicleType=" + vehicleType + ", rideType=" + rideType
				+ "]";
	}
}
