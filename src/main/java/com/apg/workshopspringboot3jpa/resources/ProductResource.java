package com.apg.workshopspringboot3jpa.resources;

import com.apg.workshopspringboot3jpa.entities.Product;
import com.apg.workshopspringboot3jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity findAll(){
        List<Product> products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
