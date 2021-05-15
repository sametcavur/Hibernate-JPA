package com.project.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@OneToOne(cascade = CascadeType.PERSIST)
	private Adres adress;
	public Personel() {
	}
	public Personel( String name, String surname, Date birthOfDate, Adres adress) {
		this.name = name;
		this.surname = surname;
		this.birthOfDate = birthOfDate;
		this.adress = adress;
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
	public Adres getAdress() {
		return adress;
	}
	public void setAdress(Adres adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", name=" + name + ", surname=" + surname + ", birthOfDate="
				+ birthOfDate + ", adress=" + adress + "]";
	}
}
