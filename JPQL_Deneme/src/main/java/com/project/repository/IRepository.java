package com.project.repository;

import java.util.List;

import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;

public interface IRepository {
	
	void saveCategory(Category category);
	
	void saveBrand(Brand brand);

	void saveProduct(Product product);
	
	void deleteProduct(Product product);
	
	void mergeProduct(Product product);
	
	List<Product> getAllProduct();
	
	List<String> getOnlyProductNames();
	
	Product getProductById(int productId);
	
	List<Object[]> getProductNamesAndPrice();
	
	List<Product> getGreatPrice(int unitPrice);
	
	List<Product> getBetweenPrice(int minUnitPrice,int maxUnitPrice);
	
	List<Product> getLikeNameProduct(String productName);
	
	List<Product> getOrderByDESC();
	
	List<Product> getOrderByASC();
	
	List<Object[]> getStatisticFromProduct();
	

}
