package com.fastcampus.ch4.practice;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board2")
public class BoardController2{

    @GetMapping
    public String board(HttpServletRequest request){
        if(!loginCheck(request)){
            return "redirect:/login/login?toRUL="+request.getRequestURL();
        }
        return "boardList2";
    }

    private boolean loginCheck(HttpServletRequest request) {

        HttpSession session = request.getSession();
        return session != null && session.getAttribute("user") != null;

    }

}





















