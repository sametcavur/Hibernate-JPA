package com.project.jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IJpaFactory {
	
	public EntityManager getEntityManager();
	public EntityTransaction getEntityTransaction();
	

}
