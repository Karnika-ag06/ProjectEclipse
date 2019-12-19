package com.shop.daos;

import java.util.List;

import com.shop.models.Product;

public interface ProductDao {
	public boolean addProduct(Product pObj);
	public boolean deleteProduct(Product pObj);
	public boolean updateProduct(Product pObj);
	public Product getProductById(int pId);
	public List<Product> getAllProducts();
}