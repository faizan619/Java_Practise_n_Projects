package com.BillingApplicationBackend.Model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(
    name="customers",
    schema = "practise_billing"
)
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    
    @Column(nullable=false,length=200)
    private String contact_person_name;

    @Column(nullable=false)
    private int contact;

    @Column(nullable=false,length=200)
    private String email;

    @Column(nullable=true,length=200)
    private String gstin;

    @Column(nullable=false,length=200)
    private String address;

    @Column(nullable=true,length=200)
    private String company_name;

    @CreationTimestamp
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    private LocalDateTime dateUpdated;

    public Customer(String contact_person_name,int contact,String email,String gstin,String address,String company_name){
        this.contact_person_name = contact_person_name;
        this.contact = contact;
        this.email = email;
        this.gstin = gstin;
        this.address = address;
        this.company_name = company_name;
    }

}
