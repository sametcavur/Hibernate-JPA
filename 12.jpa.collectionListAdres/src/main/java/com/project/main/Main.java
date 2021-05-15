package com.project.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Adres;
import com.project.model.Personal;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Adres adres = new Adres("113/1","beþtelsiz","raufDenktas");
		Adres adres1 = new Adres("11.Sokak","tesiz","renkas");
		List<Adres> adresler = new ArrayList<Adres>();
		adresler.add(adres);
		adresler.add(adres1);
		Personal personal = new Personal("personal1","p1Surname",adresler);
		entityTransaction.begin();
		entityManager.persist(personal);
		entityTransaction.commit();
		
	}
}
