package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@RestController
 class HelloWorldController{
    @GetMapping("/")
    public String welcomeMsg()
    {
        return "Welcome to the Spring Boot Application";
    }

    @GetMapping("date")
    public LocalDate getDate()
    {
        LocalDate ld= LocalDate.now().plusDays(100);
        return ld;
    }


}

