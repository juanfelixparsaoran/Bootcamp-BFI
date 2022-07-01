package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.model.Product;

public interface ProductRepository extends JpaRepository <Product,Integer>{
    
}
