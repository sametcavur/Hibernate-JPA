package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "personel")
public class Personel {
	@Id
	@Column(name = "personelId" ,unique=true,length=10,nullable=true,updatable = false)//Column adýný vermezsek bile deðiþkenin adýyla oluþturur.
	//Unique=Benzersiz olmasý ayný Id’den bir tane daha olmaz.
	//Tabi bu primary key olduðu için zaten benzersiz.Length=karakter uzunluðu,nullable=true = boþ býrakýlabilir,
	//updatable=false = daha sonra güncellenemez demek
	private int personelId;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.TIMESTAMP)//DATE Sadece Tarih,TIME sadece saat,TIMESTAMP ikisinide tutar.
	private Date birthOfDate;
	@Lob //About uzun olacaðý için,uzun veri alabilir demek
	private String about;
	@Transient //Veritabanýnda böyle bir alan açma demek
	private double salary;
	private String personelNumber;
	
	public Personel() {
		
	}

	public Personel(int personelId, String firstName, String lastName, Date birthOfDate, String personelNumber,String about) {
		this.personelId = personelId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
		this.about = about;
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
	

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthOfDate=" + birthOfDate + ", about=" + about + ", personelNumber=" + personelNumber + "]";
	}

	
}
