package com.project.main;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Personel;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		 Map<String, String> phoneNumbers = new HashMap<String, String>();
		 phoneNumbers.put("Cep", "2134");
		 phoneNumbers.put("Ýþ", "89894");
		Personel personal = new Personel("Samet","Surname",phoneNumbers);
		
		entityTransaction.begin();
		//entityManager.persist(personal);
		
		System.out.println(entityManager.find(Personel.class,2));
		entityTransaction.commit();
		
		
	}
}
