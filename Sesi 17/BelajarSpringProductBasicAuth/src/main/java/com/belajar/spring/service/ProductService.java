package com.belajar.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.spring.model.Product;
import com.belajar.spring.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> ListAllProduct(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public Product getProduct(Integer id){
        return productRepository.findById(id).get();
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    
}
