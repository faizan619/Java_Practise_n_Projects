package com.simpleWebApp.service;

import com.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(101, "Samsung", 50000), 
        new Product(102, "IPhone", 350000),
        new Product(103, "Vivo", 120000));

    public List<Product> getProducts() {
        return products;
    }

}
