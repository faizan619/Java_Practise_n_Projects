package com.ecomm.Repo;

import java.util.List;

import com.ecomm.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // JPQL - JP Query Language
    @Query("SELECT p from Product p WHERE "+
    "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword ,'%')) OR "+
    "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword ,'%')) ")

    
    // "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword ,'%')) OR" +
    // "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword ,'%')) OR"+

    List<Product> searchByProducts(String keyword);
}
