package com.project.queries;


public class Queries {
	public static final String getAllProduct ="SELECT p FROM Product p";
	public static final String getOnlyProductNames ="SELECT p.productName FROM Product p ";
	public static final String getProductById ="SELECT p FROM Product p WHERE p.productId=:productId";
	public static final String getProductNamesAndPrice ="SELECT p.productName, p.unitPrice FROM Product p";
	public static final String getGreatPrice ="SELECT p FROM Product p WHERE p.unitPrice > :unitPrice";
	public static final String getBetweenPrice ="SELECT p FROM Product p WHERE p.unitPrice BETWEEN :minUnitPrice AND :maxUnitPrice";
	public static final String getLikeNameProduct ="SELECT p FROM Product p WHERE p.productName LIKE :productName";
	public static final String getOrderByDESC ="SELECT p FROM Product p ORDER BY p.unitPrice DESC";
	public static final String getOrderByASC ="SELECT p FROM Product p ORDER BY p.unitPrice ASC";
	public static final String getStatisticFromProduct = "SELECT AVG(p.unitPrice), SUM(p.unitPrice), MAX(p.unitPrice), MIN(p.unitPrice), COUNT(p) FROM Product p";
	

}
