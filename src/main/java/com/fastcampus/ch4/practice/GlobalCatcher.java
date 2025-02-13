package com.fastcampus.ch4.practice;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.FileNotFoundException;

@ControllerAdvice("com.fastcampus.ch4.practice")
public class GlobalCatcher {


    @ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
    public String catcher(Exception ex, Model m) {
        return "error";

    }
}




