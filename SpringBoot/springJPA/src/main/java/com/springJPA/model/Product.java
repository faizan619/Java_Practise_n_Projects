package com.springJPA.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

// This Annotation is used to specify a class as a JPA entity
@Entity

// In table we can define the name of table and schema is the database name
@Table(
    name="products_jpa",
    schema="practise",
    // below is the way we can make a column a unique constrain
    uniqueConstraints={

        @UniqueConstraint(
            name = "sku_unique",
            columnNames="stock_keeping_unit"
        ),

        @UniqueConstraint(
            name = "name_unique",
            columnNames = "name"
        )
    }
)
public class Product {
    
    @Id
    // the identity stategy relies of the database auto increment column
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;

    // it is used to change the column name to this given name.
    @Column(name="stock_keeping_unit",nullable=false)
    private String sku;

    @Column(nullable=false, length=150)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



}
