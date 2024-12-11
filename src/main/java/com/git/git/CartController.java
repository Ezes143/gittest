package com.git.git;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class CartController {


    @GetMapping("/cart")
    public  String cart(  Model model){

        ArrayList<String> list = new ArrayList<>();
        list.add("모자");
        list.add("빵");
        list.add("패딩");

        model.addAttribute("list", list);
        return  "cart";

    }
}
