package com.crud1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        // return "Hello Welcome to Java- Spring boot Project";
        return "redirect:/index.html";
    }

    @RequestMapping("/about")
    public String aboutUs(){
        return "This is about us page";
    }
    
    @RequestMapping("/contact")
    public String contact(){
        return "This is the contact page";
    }

}
