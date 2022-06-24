package com.belajar.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.spring.model.Product;
import com.belajar.spring.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController{

    @Autowired
    ProductService productService;

    @CrossOrigin
    @PostMapping(value = "/")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return new ResponseEntity<>("Sukses Add",HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Sukses Delete",HttpStatus.OK);
        
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Product> getAllProduct(){
        return productService.ListAllProduct();
    }

}