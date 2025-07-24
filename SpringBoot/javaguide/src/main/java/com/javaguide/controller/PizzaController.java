package com.javaguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.javaguide.Autowireds.firstAuto;

@Component
public class PizzaController {
    
    @Autowired
    @Qualifier("first3")
    private firstAuto firstauto;

    public String getPizza(){
        return firstauto.getPizza();
    }
}
