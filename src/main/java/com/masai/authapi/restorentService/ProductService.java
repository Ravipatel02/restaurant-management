package com.masai.authapi.restorentService;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.masai.authapi.Exception.ProductIdNotFondException;
import com.masai.authapi.restorentEntity.Product;

public interface ProductService {
	List<Product> getAllMenuItems();

	Product addNewProduct(Product product);

	Product updateMenuItem(Product product , Integer id) throws ProductIdNotFondException;

	Product deleteMenuItem(Integer productId) throws ProductIdNotFondException;

	List<String> getAllProductNames();

}