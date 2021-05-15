package com.project.JPAFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IJPAFactory {
	EntityManager getEntityManager();
	EntityTransaction getEntityTransaction();
}
