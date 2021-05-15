package com.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Personal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	private String name;
	private String surname;
	@ElementCollection
	@CollectionTable(name = "pers_Adres",joinColumns = @JoinColumn(name ="Personal_ID"))
	private List<Adres> adresler = new ArrayList<Adres>();
	
	public Personal() {
		// TODO Auto-generated constructor stub
	}

	public Personal(String name, String surname, List<Adres> adresler) {
		this.name = name;
		this.surname = surname;
		this.adresler = adresler;
	}

	public int getPersonelId() {
		return personelId;
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

	public List<Adres> getAdresler() {
		return adresler;
	}

	public void setAdresler(List<Adres> adresler) {
		this.adresler = adresler;
	}

	@Override
	public String toString() {
		return "Personal [personelId=" + personelId + ", name=" + name + ", surname=" + surname + ", adresler="
				+ adresler + "]";
	}
}
