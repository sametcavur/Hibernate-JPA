package com.project.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
@Entity
@Table(name ="personel")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	private String name;
	private String surName;
	@ElementCollection
	@CollectionTable(name ="personelNumbers",joinColumns = @JoinColumn(name="PersonelId"))
	@MapKeyColumn(name ="Numaralar")
	@Column(name ="telefonNumaralarý")
	private Map<String, String> phoneNumbers = new HashMap<String, String>();

	public Personel() {
		// TODO Auto-generated constructor stub
	}

	
	public Personel(String name, String surName, Map<String, String> phoneNumbers) {
		this.name = name;
		this.surName = surName;
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


	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(Map<String, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", name=" + name + ", surName=" + surName + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
}