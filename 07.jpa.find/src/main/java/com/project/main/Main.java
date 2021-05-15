package com.project.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.project.model.Product;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product product = entityManager.find(Product.class, 1);
		if(product != null) {
		System.out.println("ÜRÜN BÝLGÝLERÝ");
		System.out.println("Product ID =" +product.getProductId());
		System.out.println("Product Ýsim =" +product.getName());
		System.out.println("Product Fiyat =" +product.getUnitPrice());
		System.out.println("Product Adet =" +product.getAvailable());
		System.out.println("Product Eklenme Tarihi =" +product.getAddDate());
		System.out.println("Product Güncellenme Tarihi =" +product.getUpdateDate());
	
		}
		else {
			System.out.println("Ürün Bulunamadý");
		}
	}

}
