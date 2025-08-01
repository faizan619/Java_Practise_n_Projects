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

    public Customer saveCustomerDetail(Customer customer){
        return repo.save(customer);
    }

    // public String deleteCustomer(Integer custId){
    public String deleteCustomer(int custId){
        if(repo.existsById(custId)){
            repo.deleteById(custId);
            return custId+" is Deleted Successfully!";
        }
        else{
            return "Customer with ID " + custId + " not found.";
        }
    }

    public Customer updateDetails(Integer custId, Customer updatedDetails){
        // return repo.save(details);
        Customer details = repo.findById(custId).orElseThrow(() -> new RuntimeException("Task with ID " + custId + " not found."));

        details.setContact_person_name(updatedDetails.getContact_person_name());
        details.setContact(updatedDetails.getContact());
        details.setEmail(updatedDetails.getEmail());
        details.setGstin(updatedDetails.getGstin());
        details.setAddress(updatedDetails.getAddress());
        details.setCompany_name(updatedDetails.getCompany_name());

        return repo.save(details);
    }
}
