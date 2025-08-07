package com.learning1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning1.model.BankDetails;
import com.learning1.repository.BankDetailsRepository;

@Service
public class BankDetailsService {

    @Autowired
    private BankDetailsRepository repo;

    // GET all bank details
    public List<BankDetails> getAllBankDetails() {
        return repo.findAll();
    }

    // GET bank details by ID
    public Optional<BankDetails> getBankDetailsById(int id) {
        return repo.findById(id);
    }

    // POST: create new bank details
    public BankDetails createBankDetails(BankDetails bankDetails) {
        return repo.save(bankDetails);
    }

    // PUT: update bank details
    public String updateBankDetails(int id, BankDetails updatedDetails) {
        Optional<BankDetails> existingOpt = repo.findById(id);
        if (existingOpt.isPresent()) {
            BankDetails existing = existingOpt.get();
            existing.setBank_account(updatedDetails.getBank_account());
            existing.setBank_name(updatedDetails.getBank_name());
            existing.setIfsc(updatedDetails.getIfsc());
            existing.setIsValid(updatedDetails.getIsValid());
            existing.setUser(updatedDetails.getUser());
            repo.save(existing);
            return "Bank details updated successfully.";
        } else {
            return "Bank details with ID " + id + " not found.";
        }
    }

    // DELETE: delete bank details
    public String deleteBankDetails(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Bank details deleted successfully.";
        } else {
            return "Bank details with ID " + id + " not found.";
        }
    }
}
