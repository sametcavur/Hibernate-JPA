package com.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="personel")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	private String name;
	private String surName;
	@Temporal(TemporalType.DATE)
	private Date birthOfDate;
	@ElementCollection
	@CollectionTable(name ="personelNumbers",joinColumns = @JoinColumn(name="PersonelId"))
	List<String> phoneNumbers;

	public Personel() {
		// TODO Auto-generated constructor stub
	}

	public Personel(String name, String surName, Date birthOfDate, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.surName = surName;
		this.birthOfDate = birthOfDate;
		this.phoneNumbers = phoneNumbers;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", name=" + name + ", surName=" + surName + ", birthOfDate="
				+ birthOfDate + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
}