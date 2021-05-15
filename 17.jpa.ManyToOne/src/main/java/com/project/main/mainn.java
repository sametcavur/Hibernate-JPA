package com.project.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.project.model.Department;

public class mainn {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Department d = entityManager.find(Department.class, 1);
		
		System.out.println(d.getEmployees());
		
		
	}

}
