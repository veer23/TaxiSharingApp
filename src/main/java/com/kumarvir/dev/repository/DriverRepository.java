package com.kumarvir.dev.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.Location;
import com.kumarvir.dev.model.RideType;
import com.kumarvir.dev.model.VehicleType;

@Component
public class DriverRepository {
	
	private List<Driver> driverList = new ArrayList<Driver>();

	public DriverRepository() {
		driverList.add(new Driver(1, new Location(11.03, 200.9), VehicleType.MICRO, RideType.SHARE));
		driverList.add(new Driver(2, new Location(78.1, 20.9), VehicleType.MINI, RideType.GO));
		driverList.add(new Driver(3, new Location(56.07, 22.76), VehicleType.LUXURY, RideType.HIRE));
		driverList.add(new Driver(4, new Location(76.03, 100.73), VehicleType.LUXURY, RideType.PREMIUM));
		driverList.add(new Driver(5, new Location(98.0, 1.9), VehicleType.SEDAN, RideType.GO));
		driverList.add(new Driver(6, new Location(72.01, 91.0), VehicleType.MICRO, RideType.PREMIUM));
		driverList.add(new Driver(7, new Location(67.05, 11.9), VehicleType.SEDAN, RideType.GO));
		driverList.add(new Driver(8, new Location(200.08, 10.0), VehicleType.MINI, RideType.HIRE));
		driverList.add(new Driver(9, new Location(71.0, 71.2), VehicleType.MICRO, RideType.GO));
		driverList.add(new Driver(10, new Location(24.04, 12.3), VehicleType.MICRO, RideType.SHARE));
	}
	
	public Driver getDriver(int id) {
		return driverList.get(id-1);
	}
	
	public void addDriver(Driver driver) {
		driverList.add(driver);
	}
	
	public List<Driver> getAllDrivers(){
		return driverList;
	}
}
