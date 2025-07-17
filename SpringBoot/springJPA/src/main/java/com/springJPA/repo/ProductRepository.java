package com.springJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springJPA.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
