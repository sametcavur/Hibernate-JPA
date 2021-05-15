package com.project.findData;
import java.util.List;

import com.project.model.Product;
import com.project.productRepository.IProductRepository;
import com.project.productRepositoryImp.ProductRepository;

public class FindData {

	private static IProductRepository productRepository = new ProductRepository();	
	
	public static List<Product> findProducts() {
		List<Product> products = productRepository.findProducts();
		for (Product product : products) {
			System.out.println(product);
		}
		return products;
	}
	
	public static Product findById(int productId) {
		Product product = productRepository.findProductById(productId);
		System.out.println(product);
		return product;
	}
	
	public static void findProductNames() {
		List<String> products = productRepository.findProductNames();
		for (String string : products) {
			System.out.println(string);
		}
	}
	
	public static void findGreatPrice(int unitPrice) {
		List<Product> products = productRepository.findGreatPrice(unitPrice);
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public static void findGreatAndLessPrice(int minUnitPrice, int maxUnitPrice) {
		List<Product> products = productRepository.findGreatAndLessPrice(minUnitPrice, maxUnitPrice);
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public static void findProductNameAndPrice() {
		//Object bir dizi yani altta findProductNameAndPrice i aldýk bir dizinin içine attýk.
		// Bu dizinin 1.elemaný 1.ürünün adý   2.elemaný ise 1. ürünün fiyatý
		//for döngüsünde olduðu için bunu yazdýrdýk diðer elemana geçtik
		// Ve artýk dizinin 1. elemaný 2.ürünün adý 2.elemaný ise 2.ürünün fiyatý
		//böyle böyle son elemana kadar gittik
		List<Object[]> list = productRepository.findProductNameAndPrice();
		for (Object[] objects : list) {
			System.out.println(objects[0] + "---" +objects[1]);
		}
	}
	public static void findLikePrdouctName(String productName) {
		List<Product> products = productRepository.findLikePrdouctName(productName);
		for (Product product : products) {
			System.out.println(product.getProductName());
		}
	}
	
	public static void findOrderByPrice() {
		List<Product> products = productRepository.findOrderByPrice();
		for (Product product : products) {
			System.out.println(product);
		}
		
	}
	
	
}
