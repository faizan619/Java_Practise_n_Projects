package com.crud1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String login(){
        // return "Login page of the User <b>Hello world</b>";
        return "redirect:/login.html";
    }

}
