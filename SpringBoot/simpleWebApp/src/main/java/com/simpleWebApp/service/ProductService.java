package com.simpleWebApp.service;

import java.util.ArrayList;

import com.simpleWebApp.model.Product;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Samsung", 50000),
            new Product(102, "IPhone", 350000),
            new Product(103, "Vivo", 120000),
            new Product(103, "VivoV7", 120000),
            new Product(103, "VivoV9", 120900),
            new Product(103, "VivoV11", 129000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                // .findFirst().get();
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    // post method
    public void addProduct(Product prod){
        System.out.println(prod);
        products.add(prod);
    }

    public void updateProductById(Product prod){
        int index = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                System.out.println("products id : "+products.get(i).getProdId());
                System.out.println("prod id : "+prod.getProdId());
                index = i;
            }
            products.set(index,prod);
        }
    }

    public void deleteProduct(int prodId) {
        // throw new UnsupportedOperationException("Not supported yet.");
        int index = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prodId){
                System.out.println("Delete : "+prodId);
                index = i;
            }
            products.remove(index);
        }

    }

}
