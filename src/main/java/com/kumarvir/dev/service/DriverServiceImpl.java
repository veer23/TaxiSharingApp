package com.kumarvir.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kumarvir.dev.controller.DriverController;
import com.kumarvir.dev.model.BookRideRequest;
import com.kumarvir.dev.model.BookRideResponse;
import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.Location;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.model.RideType;
import com.kumarvir.dev.model.VehicleType;
import com.kumarvir.dev.repository.DriverRepository;
import com.kumarvir.dev.repository.RideRepository;

@Component
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	DriverRepository driverRepo;
	
	@Autowired
	RideRepository rideRepo;
	
	@Autowired
	UserService userService;
	
	public static final Logger log = LoggerFactory.getLogger(DriverService.class);

	@Override
	public boolean addDriver(Driver driver) {
		driverRepo.addDriver(driver);
		return true;
	}

	@Override
	public List<Driver> getDrivers() {
		return driverRepo.getAllDrivers();
	}

	@Override
	public BookRideResponse bookRide(BookRideRequest request) {
		List<Driver> driverList = driverRepo.getAllDrivers();
		BookRideResponse response = new BookRideResponse();
		double dist = 99999999999.0;
		for(Driver driver : driverList) {
			if(request.getRidePrefence().equals(driver.getRideType()) && request.getVehicleType().equals(driver.getVehicleType())) {
				double temp = Math.sqrt(Math.pow(driver.getLocation().getLatitude()-request.getSource().getLatitude(), 2) + Math.pow(driver.getLocation().getLongitude()- request.getSource().getLongitude(), 2));
				//log.error("Value of temp "+temp);
				if(temp<=dist) {
					response.setDriverDetail(driver);
					log.info("source : "+request.getSource().getLatitude()+" dest : "+request.getDestination().getLatitude());
					double fare = calculateFare(request.getSource(), request.getDestination(), request.getVehicleType(), request.getRidePrefence());
					response.setFare(fare);
				}
			}
		}
		RideDetail ride = new RideDetail(response, userService.getUser(request.getUserid()).getUserid());
		rideRepo.addRide(ride);
		return response;
	}
	
	private double calculateFare(Location source, Location dest, VehicleType vehicle, RideType ride) {
		double vehicleFactor = 1.0;
		if(vehicle.equals(VehicleType.MINI)) {
			vehicleFactor = 2.0;
		}else if(vehicle.equals(VehicleType.SEDAN)) {
			vehicleFactor = 3.0;
		}else if(vehicle.equals(VehicleType.LUXURY)) {
			vehicleFactor = 5.0;
		}
		
		double rideFactor = 1.0;
		if(ride.equals(RideType.GO)) {
			rideFactor = 2.0;
		}else if(ride.equals(RideType.HIRE)) {
			rideFactor = 2.0;
		}else if(ride.equals(RideType.PREMIUM)) {
			rideFactor = 5.0;
		}
		
		return rideFactor*vehicleFactor*Math.sqrt(Math.pow(source.getLatitude()-dest.getLatitude(), 2) + Math.pow(source.getLongitude()-dest.getLongitude(), 2))*10;
	}

	@Override
	public Driver getDriver(int id) {
		return driverRepo.getDriver(id);
	}

	@Override
	public List<RideDetail> getRidesByDriver(int id) {
		Driver driver = driverRepo.getDriver(id);
		log.info(driver.toString());
		return rideRepo.getRideByDriver(driver);
	}

}
