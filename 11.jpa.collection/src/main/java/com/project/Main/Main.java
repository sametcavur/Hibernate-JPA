package com.project.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

		List<String> numbers = new ArrayList<>();
		numbers.add("123");
		numbers.add("432");
		numbers.add("853");
		Personel personel = new Personel("samet","çavur",new Date(),numbers);

		entityTransaction.begin();
		entityManager.persist(personel);
		entityTransaction.commit();

	}
}
