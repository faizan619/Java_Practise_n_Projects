package com.simpleWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor
@Component
@Entity         // hibernate k time isse use karna hai for saving the data by repo
public class Product {
    
    @Id
    private int prodId;
    private String prodName;
    private int price;

    

    public Product(int prodId, String prodName, int price){
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public Product() {
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("prodId=").append(prodId);
        sb.append(", prodName=").append(prodName);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }


    
    
}
