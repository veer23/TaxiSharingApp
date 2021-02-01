package com.kumarvir.dev.model;

public class User {
	
	private int id;

	private String name;
	
	private String userid;
	
	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public User(int id, String name, String userid) {
		super();
		this.id = id;
		this.name = name;
		this.userid = userid;
	}
}
