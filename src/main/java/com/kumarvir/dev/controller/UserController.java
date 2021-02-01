package com.kumarvir.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kumarvir.dev.model.BookRideRequest;
import com.kumarvir.dev.model.BookRideResponse;
import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.Location;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.model.User;
import com.kumarvir.dev.service.DriverService;
import com.kumarvir.dev.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void createSpanishGreeting(@RequestBody User user) {
    	userService.addUser(user);
    }
    
    
    @PostMapping("/book")
    public BookRideResponse bookTaxi(@RequestBody BookRideRequest request) {
    	return userService.bookRide(request);
    }
    
    @GetMapping("/list")
    public List<User> getAllUsers(){
    	return userService.getUsers();
    }
    
    @GetMapping("/getride/{id}")
    public List<RideDetail> getRidesByUser(@PathVariable("id") final int id){
    	return userService.getRideByUser(id);
    }
	
}
