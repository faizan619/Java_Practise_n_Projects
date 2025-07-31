package com.BillingApplicationBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BillingApplicationBackend.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
