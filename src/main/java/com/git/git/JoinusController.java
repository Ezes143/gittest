package com.git.git;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinusController {


    @GetMapping("/joinus")
    public  String  joinus(){


        return  "joinus";
    }



    @PostMapping("/joinus")
    public  String  joinus2(){


        return  "redirect:/main";
    }
}
