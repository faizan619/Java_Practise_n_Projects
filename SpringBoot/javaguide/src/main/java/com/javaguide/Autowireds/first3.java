package com.javaguide.Autowireds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("first3")
// @Primary
public class first3 implements firstAuto {

    @Value("Faizan Alam")
    String name;
    
    @Override
    public String getPizza(){
        return "This is first3 "+name;
    }
}
