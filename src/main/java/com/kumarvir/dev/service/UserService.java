package com.kumarvir.dev.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kumarvir.dev.model.BookRideRequest;
import com.kumarvir.dev.model.BookRideResponse;
import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.model.User;

@Component
public interface UserService {
	
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
	
	public List<RideDetail> getRideByUser(int id);
	
	public BookRideResponse bookRide(BookRideRequest request);
	
}
