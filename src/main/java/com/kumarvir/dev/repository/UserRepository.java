package com.kumarvir.dev.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kumarvir.dev.model.User;

@Component
public class UserRepository {
	
	private List<User> userList = new ArrayList<>();
	
	public UserRepository() {
		userList.add(new User(1, "adam", "adam123"));
		userList.add(new User(2, "alice", "alice81"));
		userList.add(new User(3, "bob", "bob21"));
		userList.add(new User(4, "bryan", "bryan123"));
		userList.add(new User(5, "charles", "charles78"));
		userList.add(new User(6, "chris", "chris_"));
		userList.add(new User(7, "john", "john99"));
		userList.add(new User(8, "paula", "paul@"));
		userList.add(new User(9, "steve", "stev123"));
		userList.add(new User(10, "stephen", "stephen007"));
	}
	
	public User getUser(int id) {
		return userList.get(id-1);
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public List<User> getAllUsers(){
		return userList;
	}

}
