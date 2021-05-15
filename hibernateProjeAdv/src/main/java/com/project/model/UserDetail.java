package com.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetail {
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private String name;
	private String surname;
	private Date birthOfDate;
	private List<Advertisement> advertisements = new ArrayList<Advertisement>();
	
	public UserDetail() {
		// TODO Auto-generated constructor stub
	}

	public UserDetail(String username, String password, String email, String phoneNumber, String name, String surname,
			Date birthOfDate, List<Advertisement> advertisements) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.surname = surname;
		this.birthOfDate = birthOfDate;
		this.advertisements = advertisements;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public List<Advertisement> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

	@Override
	public String toString() {
		return "UserDetail [username=" + username + ", password=" + password + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", name=" + name + ", surname=" + surname + ", birthOfDate=" + birthOfDate
				+ ", advertisements=" + advertisements + "]";
	}
	

}
