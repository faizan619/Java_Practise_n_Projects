package com.javaguide.Autowireds;

import org.springframework.stereotype.Component;

@Component("first2")
public class first2 implements firstAuto{

    @Override
    public String getPizza(){
        return "this is First2 Pizza";
    }
}
