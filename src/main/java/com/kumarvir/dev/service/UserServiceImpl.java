package com.kumarvir.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kumarvir.dev.model.BookRideRequest;
import com.kumarvir.dev.model.BookRideResponse;
import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.model.User;
import com.kumarvir.dev.repository.RideRepository;
import com.kumarvir.dev.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RideRepository rideRepo;
	
	@Autowired
	private DriverService driverService;

	@Override
	public boolean addUser(User user) {
		userRepo.addUser(user);
		return true;
	}

	@Override
	public List<User> getUsers() {
		return userRepo.getAllUsers();
	}

	@Override
	public List<RideDetail> getRideByUser(int id) {
		User user = userRepo.getUser(id);
		return rideRepo.getRideByUser(user);
	}

	@Override
	public BookRideResponse bookRide(BookRideRequest request) {
		return driverService.bookRide(request);
	}

	@Override
	public User getUser(int id) {
		return userRepo.getUser(id);
	}

}
