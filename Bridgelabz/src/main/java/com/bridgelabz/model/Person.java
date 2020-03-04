package com.bridgelabz.model;

import org.json.simple.JSONObject;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	
	public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	
	public JSONObject toJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("First Name", firstName);
		jsonObject.put("Last Name", lastName);
		jsonObject.put("Address", address);
		jsonObject.put("City", city);
		jsonObject.put("State", state);
		jsonObject.put("Zip", zip);
		jsonObject.put("Phone Number", phoneNumber);
		return jsonObject;
	}
}
