package com.project.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.project.JPAFactory.IJPAFactory;
import com.project.JPAFactoryImpl.JPAFactory;
import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;
import com.project.queries.Queries;
import com.project.repository.IRepository;

public class Repository implements IRepository{
	IJPAFactory jpafactory = new JPAFactory();
	EntityManager entityManager = jpafactory.getEntityManager();
	EntityTransaction entityTransaction = jpafactory.getEntityTransaction();
	
	@Override
	public void saveProduct(Product product) {
	entityTransaction.begin();
	entityManager.persist(product);
	entityTransaction.commit();
		
	}

	@Override
	public void deleteProduct(Product product) {
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
	}

	@Override
	public void mergeProduct(Product product) {
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
	}

	@Override
	public List<Product> getAllProduct() {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getAllProduct,Product.class);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public List<String> getOnlyProductNames() {
		TypedQuery<String> query = this.entityManager.createQuery(Queries.getOnlyProductNames,String.class);
		List<String> products = query.getResultList();
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getProductById,Product.class);
		query.setParameter("productId", productId);
		Product product = query.getSingleResult();
		return product;
	}

	@Override
	public List<Object[]> getProductNamesAndPrice() {
		TypedQuery<Object[]> query = this.entityManager.createQuery(Queries.getProductNamesAndPrice,Object[].class);
		List<Object[]> products = query.getResultList();
		return products;
	}
	@Override
	public List<Product> getGreatPrice(int unitPrice) {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getGreatPrice,Product.class);
		query.setParameter("unitPrice", unitPrice);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public List<Product> getBetweenPrice(int minUnitPrice, int maxUnitPrice) {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getBetweenPrice,Product.class);
		query.setParameter("minUnitPrice", minUnitPrice);
		query.setParameter("maxUnitPrice", maxUnitPrice);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public List<Product> getLikeNameProduct(String productName) {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getLikeNameProduct,Product.class);
		query.setParameter("productName","%"+productName+"%");
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public List<Product> getOrderByDESC() {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getOrderByDESC,Product.class);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public List<Product> getOrderByASC() {
		TypedQuery<Product> query = this.entityManager.createQuery(Queries.getOrderByASC,Product.class);
		List<Product> products = query.getResultList();
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getStatisticFromProduct() {
		Query query = this.entityManager.createQuery(Queries.getStatisticFromProduct);
		List<Object[]> list = query.getResultList();
		return list;
	}

	@Override
	public void saveCategory(Category category) {
		entityTransaction.begin();
		entityManager.persist(category);
		entityTransaction.commit();
		
	}

	@Override
	public void saveBrand(Brand brand) {
		entityTransaction.begin();
		entityManager.persist(brand);
		entityTransaction.commit();
		
	}


}
