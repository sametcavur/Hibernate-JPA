package com.project.insertData;

import com.project.model.Brand;
import com.project.model.Category;
import com.project.model.Product;
import com.project.repository.IRepository;
import com.project.repositoryImpl.Repository;

public class InsertData {
	

	private static IRepository repository = new Repository();
	
	public static void insertData() {
	
	Category category1 = new Category("Phone");
	Category category2 = new Category("Pc");
	Category category3 = new Category("Tablet");
	
	Brand brand1 = new Brand("Ýphone");
	Brand brand2 = new Brand("Huawei");
	Brand brand3 = new Brand("Samsung");
	Brand brand4 = new Brand("Xiaomi");
	
	Product product1 = new Product("Ýphone 7 Plus", 150, 5700, category1, brand1);
	Product product2 = new Product("Xiaomi POCO", 76, 4700, category1, brand4);
	Product product3 = new Product("Huawei RealMi", 15, 3700, category1, brand2);
	Product product4 = new Product("Ýphone 12 Pro Max", 350, 15700, category1, brand1);
	Product product5 = new Product("MacOS PC", 53, 25700, category2, brand1);
	Product product6 = new Product("Huawei NoteBook", 80, 9700, category2, brand2);
	Product product7 = new Product("iPad", 13, 10200, category3, brand1);
	Product product8 = new Product("Xiaomi Tablet", 26, 6700, category3, brand4);
	Product product9 = new Product("Samsung Galaxt 10", 430, 9500, category1, brand3);

	repository.saveCategory(category1);
	repository.saveCategory(category2);
	repository.saveCategory(category3);
	
	repository.saveBrand(brand1);
	repository.saveBrand(brand2);
	repository.saveBrand(brand3);
	repository.saveBrand(brand4);
	
	repository.saveProduct(product1);
	repository.saveProduct(product2);
	repository.saveProduct(product3);
	repository.saveProduct(product4);
	repository.saveProduct(product5);
	repository.saveProduct(product6);
	repository.saveProduct(product7);
	repository.saveProduct(product8);
	repository.saveProduct(product9);
	}
}
