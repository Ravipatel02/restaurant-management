package com.masai.authapi.restorentRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.masai.authapi.restorentEntity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	

};