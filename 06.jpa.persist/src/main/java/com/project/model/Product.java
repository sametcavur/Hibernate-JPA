package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product")
public class Product {
	@Id
	private int productId;
	private String name;
	private double unitPrice;
	private int available;
	@Temporal(TemporalType.TIMESTAMP)
	private Date addDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	public Product() {
		
	}
	public Product(int productId, String name, double unitPrice, int available, Date addDate, Date updateDate) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.available = available;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
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
		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", available="
				+ available + ", addDate=" + addDate + ", updateDate=" + updateDate + "]";
	}
}
