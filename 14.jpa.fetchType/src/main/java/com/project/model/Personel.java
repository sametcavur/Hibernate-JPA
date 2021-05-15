package com.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	private String name;
	private String surname;
	@Temporal(TemporalType.DATE)
	private Date birthOfDate;
	
	@ElementCollection
	@CollectionTable(name="PersonelPNumber",joinColumns = @JoinColumn(name="PersonelID"))
	private Map<String, String> phoneNumbers = new HashMap<String, String>();
	
	@ElementCollection
	@CollectionTable(name="PersonelAdres",joinColumns = @JoinColumn(name="PersonelID"))
	private List<Adres> adress = new ArrayList<Adres>();
	
	@ElementCollection
	@CollectionTable(name="PersonelEmail",joinColumns = @JoinColumn(name="PersonelID"))
	private List<String> emails= new ArrayList<String>();
	
	public Personel() {
	}
	public Personel(String name, String surname, Date birthOfDate, Map<String, String> phoneNumbers, List<Adres> adress,
			List<String> emails) {
		this.name = name;
		this.surname = surname;
		this.birthOfDate = birthOfDate;
		this.phoneNumbers = phoneNumbers;
		this.adress = adress;
		this.emails = emails;
	}

	public void addPhoneNumbers(String key,String value) {
		phoneNumbers.put(key, value);
	}
	public void addAdres(Adres adres) {
		adress.add(adres);
	}
	public void addEmail(String email) {
		emails.add(email);
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

	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Map<String, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Adres> getAdress() {
		return adress;
	}

	public void setAdress(List<Adres> adress) {
		this.adress = adress;
	}

	public List<String> getEmail() {
		return emails;
	}

	public void setEmail(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", name=" + name + ", surname=" + surname + ", birthOfDate="
				+ birthOfDate + ", phoneNumbers=" + phoneNumbers + ", adress=" + adress + ", emails=" + emails + "]";
	}
}
