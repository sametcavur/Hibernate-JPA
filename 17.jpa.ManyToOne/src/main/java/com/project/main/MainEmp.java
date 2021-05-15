package com.project.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Department;
import com.project.model.Employee;

public class MainEmp {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee("Hakan", "Mert", new Date(),null);
		
		Department dep = entityManager.find(Department.class,2);
	
		employee.setDepartment(dep);
		
		entityTransaction.begin();
		
		entityManager.persist(employee);
		
		entityTransaction.commit();
		
	}

}
