package com.springJPA.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.*;

// This Annotation is used to specify a class as a JPA entity
@Entity

// Everything setter, getter, constructor is removed because of this annotation . it alone handle everything has reduce line of code
@Getter
@Setter
@AllArgsConstructor     // it means parameterised constructor
@NoArgsConstructor      // it means default constructor
@ToString 
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
    // @GeneratedValue(strategy = GenerationType.IDENTITY)  

    // JPA supported 4 different types primary key generation strategies that generated the primary key value programmlically or use database feature,like auto increment column or sequence.

    //@GeneratedValue(strategy = GenerationType.AUTO)  // this is default generation type and let the persistence provider choose the generation strategy-- and persistence provider most of the time use sequence as a primary key generator.

    // @GeneratedValue(strategy = GenerationType.IDENTITY)  // it relies on auto increment database column and let the database generate a new value with each insert operation

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_generator_n")
    @SequenceGenerator(name="product_generator_n",sequenceName="product_sequence_name",allocationSize=1)    // this create a new table to store the primary key 
    
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

    // ALL, PERSIST, MERGE, REFRESH, DETACH
    @OneToMany(cascade = CascadeType.ALL) //-- all means when the product is save then all the buyerId is also saved
    @JoinColumn(name="pc_fid",referencedColumnName = "id")
    List<Buyers> buyersId = new ArrayList<>();

    @OntToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="prod_d",referencedColumnName = "id")
    private ProductDetails productDetail;


    // This annotation is provided by hibernate
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    private LocalDateTime lastUpdated;


    // Below everything is removed because of lombok library annotation @Getter and @Setter
    // public long getId() {
    //     return id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public String getSku() {
    //     return sku;
    // }

    // public void setSku(String sku) {
    //     this.sku = sku;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public BigDecimal getPrice() {
    //     return price;
    // }

    // public void setPrice(BigDecimal price) {
    //     this.price = price;
    // }

    // public boolean isActive() {
    //     return active;
    // }

    // public void setActive(boolean active) {
    //     this.active = active;
    // }

    // public String getImageUrl() {
    //     return imageUrl;
    // }

    // public void setImageUrl(String imageUrl) {
    //     this.imageUrl = imageUrl;
    // }

    // public LocalDateTime getDateCreated() {
    //     return dateCreated;
    // }

    // public void setDateCreated(LocalDateTime dateCreated) {
    //     this.dateCreated = dateCreated;
    // }

    // public LocalDateTime getLastUpdated() {
    //     return lastUpdated;
    // }

    // public void setLastUpdated(LocalDateTime lastUpdated) {
    //     this.lastUpdated = lastUpdated;
    // }



}
