package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personel")  
public class Personel {
	@Id
	@Column(name="personelId") 
	private int personelId;
	@Column(name="firstName") 
	private String firstName;
	@Column(name="lastName") 
	private String lastName;
	@Column(name="birthOfDate") 
	private Date birthOfDate;
	@Column(name="personelNumber") 
	private String personelNumber;
	
	public Personel() {
		
	}

	public Personel(int personelId, String firstName, String lastName, Date birthOfDate, String personelNumber) {
		this.personelId = personelId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getPersonelNumber() {
		return personelNumber;
	}

	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
	
	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthOfDate=" + birthOfDate + ", personelNumber=" + personelNumber + "]";
	}

	
}
