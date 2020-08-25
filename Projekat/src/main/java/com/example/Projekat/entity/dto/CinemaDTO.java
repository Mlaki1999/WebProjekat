package com.example.Projekat.entity.dto;

public class CinemaDTO {

	private String name;
	
	
	private String address;
	
	
	private String phone_number;
	
	
	private String email;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public CinemaDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public CinemaDTO() {}


	public CinemaDTO(String name, String address, String phone_number, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
	}
	
}
