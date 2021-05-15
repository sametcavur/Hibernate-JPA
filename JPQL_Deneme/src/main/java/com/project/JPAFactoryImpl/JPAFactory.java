package com.project.JPAFactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.JPAFactory.IJPAFactory;

public class JPAFactory implements IJPAFactory{
	EntityManager entityManager=null;
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		return entityTransaction;
	}

}
