package com.project.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.project.jpaFactory.JPAFactory;
import com.project.model.Advertisement;
import com.project.model.User;
import com.project.repository.IUserRepository;

public class UserRepository implements IUserRepository{
	JPAFactory jpaFactory = new JPAFactory();
	EntityManager entityManager = jpaFactory.getEntityManager();
	EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();
	@Override
	
	public User findById(int userId) {
		TypedQuery<User> query = entityManager.createNamedQuery("User.findById",User.class);
		query.setParameter("userId", userId);
		User user = query.getSingleResult();
		return user;
	}
	
	@Override
	public void findByUsername(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findUserCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAdvertisementByUsername(String username) {
		TypedQuery<User> typedQuery = entityManager.createNamedQuery("User.findAdvertisementByUsername",User.class);
		typedQuery.setParameter("username",	username);
		List<User> advertisements = typedQuery.getResultList();
		for (User advertisement : advertisements) {
			System.out.println(advertisement);
		}
		
	}

}
