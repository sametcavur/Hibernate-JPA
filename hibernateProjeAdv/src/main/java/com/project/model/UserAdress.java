package com.project.model;

import javax.persistence.Embeddable;

@Embeddable
public class UserAdress {
	private String sokak;
	private String mahalle;
	private String ilce;
	private String il;
	private String postalCode;
	
	public UserAdress() {
		// TODO Auto-generated constructor stub
	}

	public UserAdress(String sokak, String mahalle, String ilce, String il, String postalCode) {
		super();
		this.sokak = sokak;
		this.mahalle = mahalle;
		this.ilce = ilce;
		this.il = il;
		this.postalCode = postalCode;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
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

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "UserAdress [sokak=" + sokak + ", mahalle=" + mahalle + ", ilce=" + ilce + ", il=" + il + ", postalCode="
				+ postalCode + "]";
	}
	
}
