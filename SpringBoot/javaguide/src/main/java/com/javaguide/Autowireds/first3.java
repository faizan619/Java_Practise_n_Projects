package com.javaguide.Autowireds;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("first3")
// @Primary
public class first3 implements firstAuto {
    
    @Override
    public String getPizza(){
        return "This is first3 pizza";
    }
}
