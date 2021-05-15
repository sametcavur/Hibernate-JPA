package com.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String reelName;
	private String reelSurname;
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthOfDate;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Product> products;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String username, String reelName, String reelSurname, Date birthOfDate, List<Product> products) {
		this.username = username;
		this.reelName = reelName;
		this.reelSurname = reelSurname;
		this.birthOfDate = birthOfDate;
		this.products = products;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getReelName() {
		return reelName;
	}


	public void setReelName(String reelName) {
		this.reelName = reelName;
	}


	public String getReelSurname() {
		return reelSurname;
	}


	public void setReelSurname(String reelSurname) {
		this.reelSurname = reelSurname;
	}


	public Date getBirthOfDate() {
		return birthOfDate;
	}


	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", reelName=" + reelName + ", reelSurname="
				+ reelSurname + ", birthOfDate=" + birthOfDate + ", products=" + products + "]";
	}
}
