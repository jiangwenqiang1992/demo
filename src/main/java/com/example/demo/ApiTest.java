package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiTest {

    @RequestMapping("/")
    @ResponseBody
    public String get(){
        return "OK : v8";
    }
}
