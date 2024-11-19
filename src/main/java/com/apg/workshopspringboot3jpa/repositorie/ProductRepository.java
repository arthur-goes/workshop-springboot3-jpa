package com.apg.workshopspringboot3jpa.repositorie;

import com.apg.workshopspringboot3jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
