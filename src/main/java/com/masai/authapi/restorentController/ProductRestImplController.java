package com.masai.authapi.restorentController;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.masai.authapi.Exception.ProductIdNotFondException;
import com.masai.authapi.restorentEntity.Product;
import com.masai.authapi.restorentService.ProductService;

import java.util.List;


@RestController
@RequestMapping("/mymenu")
public class ProductRestImplController {

    @Autowired
    ProductService productservice;


    @PostMapping("/addProduct")
    public ResponseEntity addNewProduct(@RequestBody Product product) {
        System.out.println("Product : " + product);
        Product newProduct = productservice.addNewProduct(product);
        return ResponseEntity.ok(newProduct);
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateMenuItem(@RequestBody Product product, @PathVariable Integer id) throws ProductIdNotFondException {
        Product updateMenuItem = this.productservice.updateMenuItem(product, id);
        return updateMenuItem;
    }

    @DeleteMapping("/deleteProdct/{productId}")
    public Product deleteMenuItem(@PathVariable Integer productId) throws ProductIdNotFondException {
        Product deleteMenuItem = this.productservice.deleteMenuItem(productId);
        return deleteMenuItem;
    }

    @GetMapping("/getData")
    public List<Product> getAllData (){
        List<Product> data= this.productservice.getAllProduct();
        return data;
    }


}