package com.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
	@NamedQuery(name ="User.findById",query = "SELECT u FROM User u JOIN FETCH u.userInfo WHERE u.userId =:userId"),
	@NamedQuery(name ="User.findByUsername",query = "SELECT u FROM User u WHERE u.username = :username"),
	@NamedQuery(name ="User.findUser",query = "SELECT u FROM User u"),
	@NamedQuery(name ="User.findUserCount",query = "SELECT COUNT(u) FROM User u"),
	@NamedQuery(name ="User.findAdvertisementByUsername",
	query = "SELECT u FROM User u JOIN FETCH u.advertisements WHERE u.username = :username")
})
public class User implements Serializable{
	private static final long serialVersionUID = 8587680849646809627L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private UserInfo userInfo;
	@Embedded
	private UserAdress userAdres;
	private Boolean confirmation = false;
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Advertisement> advertisements = new ArrayList<Advertisement>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String email, String phoneNumber, UserAdress userAdres,UserInfo userInfo) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userAdres = userAdres;
		this.userInfo= userInfo;
	}

	public void addAdvertisement(Advertisement advertisement) {
		advertisements.add(advertisement);
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

	public UserAdress getUserAdres() {
		return userAdres;
	}

	public void setUserAdres(UserAdress userAdres) {
		this.userAdres = userAdres;
	}

	public Boolean getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Boolean confirmation) {
		this.confirmation = confirmation;
	}

	public List<Advertisement> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", userAdres=" + userAdres + ", confirmation=" + confirmation + "]";
	}
}
