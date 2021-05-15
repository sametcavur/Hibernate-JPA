package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adres {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adresId;
	private String sokak;
	private String cadde;
	private String mahalle;
	private String ilce;
	
	public Adres() {
		// TODO Auto-generated constructor stub
	}

	public Adres(String sokak, String cadde, String mahalle, String ilce) {
		this.sokak = sokak;
		this.cadde = cadde;
		this.mahalle = mahalle;
		this.ilce = ilce;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	@Override
	public String toString() {
		return "Adres [adresId=" + adresId + ", sokak=" + sokak + ", cadde=" + cadde + ", mahalle=" + mahalle
				+ ", ilce=" + ilce + "]";
	}

	
}
