package com.BillingApplicationBackend.Controller;

import java.util.List;

import com.BillingApplicationBackend.Model.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BillingApplicationBackend.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public String showMessage() {
        return "Welcome to The Billing Application Project!";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return service.getCustomers();
    }

    @GetMapping("/customers/{custId}")
    public Customer getCustomerId(@PathVariable int custId){
        return service.getCustomerById(custId);
    }
}
