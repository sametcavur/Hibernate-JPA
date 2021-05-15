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
		//Object bir dizi yani altta findProductNameAndPrice i ald�k bir dizinin i�ine att�k.
		// Bu dizinin 1.eleman� 1.�r�n�n ad�   2.eleman� ise 1. �r�n�n fiyat�
		//for d�ng�s�nde oldu�u i�in bunu yazd�rd�k di�er elemana ge�tik
		// Ve art�k dizinin 1. eleman� 2.�r�n�n ad� 2.eleman� ise 2.�r�n�n fiyat�
		//b�yle b�yle son elemana kadar gittik
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
