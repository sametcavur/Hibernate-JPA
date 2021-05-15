package com.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "findAllAdvertisement",query = "SELECT a FROM Advertisement a")
})
public class Advertisement implements Serializable{

	private static final long serialVersionUID = -3424826936126958911L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int advertisementId;
	private String adversitementName;
	@ManyToMany(mappedBy = "advertisements")
	private List<User> users = new ArrayList<User>();

	public Advertisement() {
	}

	public Advertisement(String adversitementName) {
		this.adversitementName = adversitementName;
	}

	public int getAdvertisementId() {
		return advertisementId;
	}

	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}

	public String getAdversitementName() {
		return adversitementName;
	}

	public void setAdversitementName(String adversitementName) {
		this.adversitementName = adversitementName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Advertisement [advertisementId=" + advertisementId + ", adversitementName=" + adversitementName
				+ ", users=" + users + "]";
	}
	
}
