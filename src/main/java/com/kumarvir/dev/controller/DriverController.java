package com.kumarvir.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.kumarvir.dev.model.Driver;
import com.kumarvir.dev.model.Location;
import com.kumarvir.dev.model.RideDetail;
import com.kumarvir.dev.service.DriverService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
	
	@Autowired
	DriverService driverService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void addDrivers(@RequestBody Driver driver) {
        driverService.addDriver(driver);
    }
    
    @GetMapping("/list")
    public List<Driver> getAllDrivers(Model model){
    	return driverService.getDrivers();
    }
    
    @GetMapping("/get/{id}")
    public Driver getDriver(@PathVariable("id") final int id) {
    	return driverService.getDriver(id);
    }
    
    @GetMapping("/getride/{id}")
    public List<RideDetail> getRidesByDriver(@PathVariable("id") final int id){
    	return driverService.getRidesByDriver(id);
    }
}
