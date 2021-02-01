package com.kumarvir.dev.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.model.User;

@Component
public class RideRepository {
	
	private List<RideDetail> rideList = new ArrayList<RideDetail>();

	public RideRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public List<RideDetail> getRideByUser(User user) {
		if(rideList.isEmpty())
			return null;
		List<RideDetail> response = new ArrayList<RideDetail>();
		for(RideDetail ride : rideList) {
			if(ride.getUserName().equals(user.getUserid())) {
				response.add(ride);
			}
		}
		return response;
	}
	
	public List<RideDetail> getRideByDriver(Driver driver){
		if(rideList.isEmpty())
			return null;
		List<RideDetail> response =  new ArrayList<RideDetail>();
		for(RideDetail ride : rideList) {
			if(ride.getRideDetail().getDriverDetail().getId()==driver.getId()) {
				response.add(ride);
			}
		}
		return response;
	}
	
	public void addRide(RideDetail ride) {
		rideList.add(ride);
	}

}
