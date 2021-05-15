package com.project.jpafactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.jpafactory.IJpaFactory;

public class JpaFactory implements IJpaFactory{
	EntityManager entityManager=null;
	
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		this.entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		return entityTransaction;
	}

}
