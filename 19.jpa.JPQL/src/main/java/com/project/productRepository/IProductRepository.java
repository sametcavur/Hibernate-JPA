package com.project.productRepository;

import java.util.List;

import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;

public interface IProductRepository {
	Product saveProduct(Product product);
	Brand saveBrand(Brand brand);
	Category saveCategory(Category category);
	List<Product> findProducts();
	List<Product> findProductsEntities(int firstResult,int maxResult);
	Product findProductById(int productId);
	List<String> findProductNames();
	List<Object[]> findProductNameAndPrice();
	List<Product> findGreatPrice(int unitPrice);
	List<Product> findGreatAndLessPrice(int minUnitPrice,int maxUnitPrice);
	List<Product> findBetweenPrice(int minUnitPrice,int maxUnitPrice);
	List<Product> findLikePrdouctName(String productName);
	List<Product> findInCategoryName(String categoryName1,String categoryName2);
	List<Product> findAllProduct(int categoryId);
	List<Object[]> findFunctionPrice();
	List<Object[]> findGroupByCategory();
	List<Object[]> findGroupByHavingCategory(double unitPrice);
	List<Product> findOrderByPrice();
}
