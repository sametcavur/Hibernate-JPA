package com.project.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Adres;
import com.project.model.Personel;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Adres adres = new Adres("das","dfs","hfas","341s");
		Personel personel = new Personel("person","surperson",new Date(),adres);
		
		transaction.begin();
		
		entityManager.persist(personel);
		
		transaction.commit();
		
		
	}
}
