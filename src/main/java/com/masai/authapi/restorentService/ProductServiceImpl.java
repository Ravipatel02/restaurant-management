package com.masai.authapi.restorentService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.authapi.Exception.ProductIdNotFondException;
import com.masai.authapi.restorentEntity.Product;
import com.masai.authapi.restorentRepository.ProductRepository;
import com.masai.authapi.utiles.RestaurantConstants;
import com.masai.authapi.utiles.RestaurantUtils;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productrepository;

	@Override
	public List<Product> getAllMenuItems() {
		List<Product> all = this.productrepository.findAll();
		return all;
	}

	@Override
	public Product addNewProduct(Product product) {
		Product save = this.productrepository.save(product);
		return save;
	}

	@Override
	public Product updateMenuItem(Product product, Integer id) throws ProductIdNotFondException {
		Optional<Product> byId = this.productrepository.findById(id);
		if(!byId.isPresent()) {
			throw new ProductIdNotFondException("product id not present "+id);
		}
		Product product2 = byId.get();
		product2.setProductName(product.getProductName());
		product2.setProductPrice(product.getProductPrice());
		Product save = this.productrepository.save(product2);
		return save;
		
	}

	@Override
	public Product deleteMenuItem(Integer productId) throws ProductIdNotFondException {
		Optional<Product> byId = this.productrepository.findById(productId);
		if(!byId.isPresent()) {
			throw new ProductIdNotFondException("product id not present "+productId);
		}
		Product product = byId.get();
		this.productrepository.deleteById(productId);
		return product;
		
		
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> allData = this.productrepository.findAll();
		return allData;
	}

	
}
