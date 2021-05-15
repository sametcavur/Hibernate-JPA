package com.project.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adres {
	private String sokak;
	private String mahalle;
	private String cadde;
	
	public Adres() {
	}
	public Adres(String sokak, String mahalle, String cadde) {
		this.sokak = sokak;
		this.mahalle = mahalle;
		this.cadde = cadde;
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
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	@Override
	public String toString() {
		return "Adres [sokak=" + sokak + ", mahalle=" + mahalle + ", cadde=" + cadde + "]";
	}
}
