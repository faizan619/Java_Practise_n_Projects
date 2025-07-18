package com.springJPA.repo;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.springJPA.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
    List<Product> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);
}
