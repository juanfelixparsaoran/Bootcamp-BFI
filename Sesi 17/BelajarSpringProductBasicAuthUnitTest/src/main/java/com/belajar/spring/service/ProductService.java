package com.belajar.spring.service;

import java.util.List;

import com.belajar.spring.model.Product;

public interface ProductService {
	
	List<Product> findAllProduct();

	Product saveProduct(Product product);

	Product findByIdProduct(Integer id);

	void deleteProduct(Integer id);

}
