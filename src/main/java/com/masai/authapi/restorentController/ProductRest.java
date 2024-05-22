package com.masai.authapi.restorentController;


import com.masai.authapi.Exception.ProductIdNotFondException;
import com.masai.authapi.restorentEntity.Product;

public interface ProductRest {

	Product addNewProduct(Product product);

	Product updateMenuItem(Product product , Integer id) throws ProductIdNotFondException;

	Product deleteMenuItem(Integer productId) throws ProductIdNotFondException;

}
