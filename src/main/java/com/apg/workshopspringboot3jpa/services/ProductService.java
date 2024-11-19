package com.apg.workshopspringboot3jpa.services;

import com.apg.workshopspringboot3jpa.entities.Product;
import com.apg.workshopspringboot3jpa.repositorie.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
