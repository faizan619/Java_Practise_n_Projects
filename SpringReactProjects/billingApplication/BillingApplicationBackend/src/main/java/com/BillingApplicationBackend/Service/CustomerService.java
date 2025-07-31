package com.BillingApplicationBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BillingApplicationBackend.Model.Customer;
import com.BillingApplicationBackend.Repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;
    
    public List<Customer> getCustomers(){
        return repo.findAll(Sort.by("id").descending());
    }

    public Customer getCustomerById(Integer custId){
        return repo.findById(custId).orElse(new Customer("Unknown", 0, "unknown@gmail.com", "Unknown", "Unknown", "unknown"));
        // return repo.findById(custId);
    }
}
