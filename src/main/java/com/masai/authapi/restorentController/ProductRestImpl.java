package com.masai.authapi.restorentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.authapi.Exception.ProductIdNotFondException;
import com.masai.authapi.restorentEntity.Product;
import com.masai.authapi.restorentService.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/mymenu")
public class ProductRestImpl implements ProductRest {

	@Autowired
	ProductService productservice;
	
	@Override
	@PostMapping("/addProduct")
	public Product addNewProduct(@RequestBody Product product) {
		Product newProduct = this.productservice.addNewProduct(product);
		return newProduct;
	}
	@Override
	@PutMapping("/updateProduct/{id}")
	public Product updateMenuItem(@RequestBody Product product,@PathVariable Integer id) throws ProductIdNotFondException {
		Product updateMenuItem = this.productservice.updateMenuItem(product, id);
		return updateMenuItem;
	}
	@Override
	@DeleteMapping("/deleteProdct/{productId}")
	public Product deleteMenuItem(@PathVariable Integer productId) throws ProductIdNotFondException {
		Product deleteMenuItem = this.productservice.deleteMenuItem(productId);
		return deleteMenuItem;
	}

	
}