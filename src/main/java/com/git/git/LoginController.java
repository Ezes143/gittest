package com.git.git;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {



    //login get

    @GetMapping("/login")
    public  String loginForm(){

        return  "login";
    }

    //login post


    @PostMapping("/login")
    public  String logn( ){


        return  "redirect:/main";
    }

}
