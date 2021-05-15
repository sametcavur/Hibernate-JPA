package com.project.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Department;
public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Department department1 = new Department("Human Resorces", 2500, 7500);
		Department department2 = new Department("SoftWare", 4300, 15220);
	
		entityTransaction.begin();
		
		entityManager.persist(department1);
		entityManager.persist(department2);
		
		entityTransaction.commit();
		
		
	}
}
