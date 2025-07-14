package com.ecomm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.Model.Product;
import com.ecomm.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    @Autowired
    private ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
