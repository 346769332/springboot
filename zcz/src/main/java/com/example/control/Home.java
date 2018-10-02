package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @RequestMapping(path = {"123"})
    public String home() {
        System.out.println("11111111111111111111111111111111111111111");
        return "home";
    }
}
