package com.project.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private int available;
	private int unitPrice;
	@ManyToOne
	private Brand productBrand;
	@ManyToOne
	private Category category;
	private Date addDate;
	private Date updateDate;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int available, int unitPrice, Brand productBrand, Category category,
			Date addDate, Date updateDate) {
		this.productName = productName;
		this.available = available;
		this.unitPrice = unitPrice;
		this.productBrand = productBrand;
		this.category = category;
		this.addDate = addDate;
		this.updateDate = updateDate;
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
	public Brand getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(Brand productBrand) {
		this.productBrand = productBrand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", available=" + available
				+ ", unitPrice=" + unitPrice + ", addDate=" + addDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
