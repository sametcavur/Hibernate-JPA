package com.project.findData;

import java.util.List;
import com.project.model.Product;
import com.project.repositoryImpl.Repository;

public class FindData {
	static Repository repository = new Repository();

	public static void getAllProduct() {
		List<Product> products = repository.getAllProduct();
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void getOnlyProductNames() {
		List<String> products = repository.getOnlyProductNames();
		for (String product : products) {
			System.out.println(product);
		}
	}

	public static void getProductById(int productId) {
		Product product = repository.getProductById(productId);
		System.out.println(product);
	}

	public static void getProductNamesAndPrice() {
		List<Object[]> products = repository.getProductNamesAndPrice();
		for (Object[] objects : products) {
			System.out.println(objects[0] +"-----" + objects[1]);
		}
	}

	public static void getGreatPrice(int unitPrice) {
		List<Product> list = repository.getGreatPrice(unitPrice);
		for (Product product : list) {
			System.out.println(product);
		}
	}

	public static void getBetweenPrice(int minUnitPrice, int maxUnitPrice) {
		List<Product> list = repository.getBetweenPrice(minUnitPrice, maxUnitPrice);
		for (Product product : list) {
			System.out.println(product);
		}
	}

	public static void getLikeNameProduct(String productName) {
		List<Product> list = repository.getLikeNameProduct(productName);
		for (Product product : list) {
			System.out.println(product);
		}
	}

	public static void getOrderByDESC() {
		List<Product> list = repository.getOrderByDESC();
		for (Product product : list) {
			System.out.println(product);
		}
	}
	
	public static void getOrderByASC() {
		List<Product> list = repository.getOrderByASC();
		for (Product product : list) {
			System.out.println(product);
		}
	}
	
	public static void getStatisticFromProduct() {
		List<Object[]> products = repository.getStatisticFromProduct();
		for (Object[] objects : products) {
			System.out.println(objects[0] +"--" + objects[1] +"--"+objects[3] +"--" + objects[4]);
		}
	}
}

