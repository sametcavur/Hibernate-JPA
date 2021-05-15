package com.project.repositoryImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.project.jpaFactory.IJpaFactory;
import com.project.jpaFactoyImp.JpaFactoryImp;
import com.project.model.Book;
import com.project.repository.BookRepository;

public class BookRepositoryImp implements BookRepository{
	IJpaFactory jpaFactory = new JpaFactoryImp();
	EntityManager entityManager = jpaFactory.getEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
	}

	@Override
	public Book find(int id) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Book book = entityManager.find(Book.class, id);
		entityTransaction.commit();
		return book;
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Book updateBook = entityManager.merge(book);
		entityTransaction.commit();
		return updateBook;
	}

}
