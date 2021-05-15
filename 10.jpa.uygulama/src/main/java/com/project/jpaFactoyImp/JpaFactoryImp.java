package com.project.jpaFactoyImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.jpaFactory.IJpaFactory;

public class JpaFactoryImp implements IJpaFactory {
	EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		this.entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		return entityTransaction ;
	}

}
