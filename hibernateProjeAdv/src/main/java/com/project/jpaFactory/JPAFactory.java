package com.project.jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAFactory {
	EntityManager entityManager = null;
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public EntityTransaction getEntityTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		return entityTransaction;
	}

}
