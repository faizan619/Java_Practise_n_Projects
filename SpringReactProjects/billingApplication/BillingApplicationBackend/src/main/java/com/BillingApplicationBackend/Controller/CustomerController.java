package com.BillingApplicationBackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/")
    public String showMessage() {
        return "Initialize the Billing Application Project";
    }
}
