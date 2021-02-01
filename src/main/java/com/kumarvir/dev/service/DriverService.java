package com.kumarvir.dev.service;

import java.util.List;

import com.kumarvir.dev.model.BookRideRequest;
import com.kumarvir.dev.model.BookRideResponse;
import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.RideDetail;

public interface DriverService {

	public boolean addDriver(Driver driver);
	
	public List<Driver> getDrivers();
	
	public Driver getDriver(int id);
	
	public BookRideResponse bookRide(BookRideRequest request);
	
	public List<RideDetail> getRidesByDriver(int id);
	
}
