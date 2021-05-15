package com.project.insertData;

import java.util.Date;

import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;
import com.project.productRepository.IProductRepository;
import com.project.productRepositoryImp.ProductRepository;

public class InsertData {
	
	private static IProductRepository productRepository = new ProductRepository();	
	
	public static void insertData() {
		Brand brand1 = new Brand("Apple");
		Brand brand2 = new Brand("Samsung");
		Brand brand3 = new Brand("Huawei");
		Brand brand4 = new Brand("Xiaomi");
		
		Category category1 = new Category("Phone");
		Category category2 = new Category("Computer");
		Category category3 = new Category("Laptop");
		Category category4 = new Category("Tablet");
		
		Product product1 = new Product("Ýphone 7 Plus", 150, 5500, brand1, category1, new Date(), null);
		Product product2 = new Product("Ýphone 12 Pro Max", 25, 17500, brand1, category1, new Date(), null);
		Product product3 = new Product("MacOs Laptop", 100, 25500, brand1, category3, new Date(), null);
		Product product4 = new Product("Xiaomi Poco 10", 250, 4500, brand4, category1, new Date(), null);
		Product product5 = new Product("Huawei MateBook", 80, 8500, brand3, category3, new Date(), null);
		Product product6 = new Product("Samsung Desktop PC", 30, 9500, brand2, category2, new Date(), null);
		Product product7 = new Product("Ýpad ", 74, 5500, brand1, category4, new Date(), null);
		Product product8 = new Product("Samsung Tablet", 50, 3500, brand2, category4, new Date(), null);
		Product product9 = new Product("Huawei MPhone", 350, 6500, brand3, category1, new Date(), null);
		Product product10 = new Product("Xiaomi Mi Pro", 32, 10750, brand4, category1, new Date(), null);
		
		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		
		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);
		productRepository.saveCategory(category4);
		
		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);
		productRepository.saveProduct(product10);
		
	}
}
