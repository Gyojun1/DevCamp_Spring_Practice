package com.fastcampus.ch4.practice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class starController {


    @GetMapping("/star")
    public String star() {
        return "star";
    }

}
