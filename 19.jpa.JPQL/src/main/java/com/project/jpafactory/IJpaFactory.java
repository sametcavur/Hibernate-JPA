package com.project.jpafactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IJpaFactory {
	EntityManager getEntityManager();
	EntityTransaction getEntityTransaction();

}
