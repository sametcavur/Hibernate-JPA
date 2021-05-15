package com.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private int available;
	private int unitPrice;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Category category;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Brand brand;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, int available, int unitPrice, Category category, Brand brand) {
		this.productName = productName;
		this.available = available;
		this.unitPrice = unitPrice;
		this.category = category;
		this.brand = brand;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", available=" + available
				+ ", unitPrice=" + unitPrice + ", category=" + category + ", brand=" + brand + "]";
	}
}
