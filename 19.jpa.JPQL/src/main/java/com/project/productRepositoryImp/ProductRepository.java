package com.project.productRepositoryImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.project.jpafactoryImpl.JpaFactory;
import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;
import com.project.productRepository.IProductRepository;
import com.project.queries.ProductQueries;

public class ProductRepository implements IProductRepository {
	JpaFactory jpafactory = new JpaFactory();
	EntityManager entityManager = jpafactory.getEntityManager();
	EntityTransaction entityTransaction = jpafactory.getEntityTransaction();

	@Override
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}

	@Override
	public Brand saveBrand(Brand brand) {
		entityTransaction.begin();
		entityManager.persist(brand);
		entityTransaction.commit();
		return brand;
	}

	@Override
	public Category saveCategory(Category category) {
		entityTransaction.begin();
		entityManager.persist(category);
		entityTransaction.commit();
		return category;
	}

	@Override
	public List<Product> findProducts() {
		// ALTERNATÝFÝ ÞU FAKAT PEK ÖNERÝLMEZ//
		// Query query = this.entityManager.createQuery(ProductQueries.findProducts);
		// List<Product> products = query.getResultList();
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProducts, Product.class);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findProductsEntities(int firstResult, int maxResult) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProducts, Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public Product findProductById(int productId) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProductById, Product.class);
		typedQuery.setParameter("productId", productId);
		Product product = typedQuery.getSingleResult();
		return product;
	}

	@Override
	public List<String> findProductNames() {
		TypedQuery<String> typedQuery = this.entityManager.createQuery(ProductQueries.findProductNames, String.class);
		List<String> list = typedQuery.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findProductNameAndPrice() {
		// Object esnek baðlantýlý bir list olduðu için typequery kullanýlamaz
		// Burada query kullanacaðýz.
		Query query = this.entityManager.createQuery(ProductQueries.findProductNamePrice);
		List<Object[]> objects = query.getResultList();
		return objects;
	}

	@Override
	public List<Product> findGreatPrice(int unitPrice) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findGreatPrice, Product.class);
		typedQuery.setParameter("unitPrice",unitPrice);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findGreatAndLessPrice(int minUnitPrice, int maxUnitPrice) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findGreatLessPrice,Product.class);
		typedQuery.setParameter("minUnitPrice",minUnitPrice);
		typedQuery.setParameter("maxUnitprice", maxUnitPrice);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findBetweenPrice(int minUnitPrice, int maxUnitPrice) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findBetweenPrice,Product.class);
		typedQuery.setParameter("minUnitPrice",minUnitPrice);
		typedQuery.setParameter("maxUnitprice", maxUnitPrice);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findLikePrdouctName(String productName) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findLikeProductName,Product.class);
		typedQuery.setParameter("productName", "%"+productName+"%");
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findInCategoryName(String categoryName1, String categoryName2) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findInCategoryName,Product.class);
		typedQuery.setParameter("categoryName1",categoryName1);
		typedQuery.setParameter("categoryName2", categoryName2);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findAllProduct(int categoryId) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findALLProduct,Product.class);
		typedQuery.setParameter("categoryId",categoryId);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findFunctionPrice() {
		Query query = this.entityManager.createQuery(ProductQueries.findFunctionsPrice);
		List<Object[]> list = query.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findGroupByCategory() {
		Query query = this.entityManager.createQuery(ProductQueries.findGroupByCategory);
		List<Object[]> list = query.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findGroupByHavingCategory(double unitPrice) {
		Query query = this.entityManager.createQuery(ProductQueries.findGroupByHavingCategory);
		List<Object[]> list = query.getResultList();
		return list;
	}

	@Override
	public List<Product> findOrderByPrice() {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findOrderByPrice,Product.class);
		List<Product> products = typedQuery.getResultList();
		return products;
	}
}
