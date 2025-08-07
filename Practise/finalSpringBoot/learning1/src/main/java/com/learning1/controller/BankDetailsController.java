package com.learning1.controller;

import com.learning1.model.BankDetails;
import com.learning1.service.BankDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bank-details")
public class BankDetailsController {

    @Autowired
    private BankDetailsService bankDetailsService;

    // GET all bank details
    @GetMapping
    public List<BankDetails> getAllBankDetails() {
        return bankDetailsService.getAllBankDetails();
    }

    // GET bank details by ID
    @GetMapping("/{id}")
    public Optional<BankDetails> getBankDetailsById(@PathVariable int id) {
        return bankDetailsService.getBankDetailsById(id);
    }

    // POST - Create new bank details
    @PostMapping
    public BankDetails createBankDetails(@RequestBody BankDetails bankDetails) {
        return bankDetailsService.createBankDetails(bankDetails);
    }

    // PUT - Update existing bank details
    @PutMapping("/{id}")
    public String updateBankDetails(@PathVariable int id, @RequestBody BankDetails bankDetails) {
        return bankDetailsService.updateBankDetails(id, bankDetails);
    }

    // DELETE - Delete bank details by ID
    @DeleteMapping("/{id}")
    public String deleteBankDetails(@PathVariable int id) {
        return bankDetailsService.deleteBankDetails(id);
    }
}
