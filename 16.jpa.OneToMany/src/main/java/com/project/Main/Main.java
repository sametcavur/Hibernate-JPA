package com.project.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Product;
import com.project.model.User;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Product product1 = new Product("iPhone 12","150",12400);
		Product product2 = new Product("Samsung S20","430",7600);
		
		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		
		User user = new User("iamcav","Samet","Çavur",new Date(),products);
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		
	}
}
