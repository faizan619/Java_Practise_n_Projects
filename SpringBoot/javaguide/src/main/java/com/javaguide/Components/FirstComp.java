package com.javaguide.Components;

import org.springframework.stereotype.Component;

@Component
public class FirstComp {
    public String giveMessage(){
        return "This is message from different folder";
    }
}
