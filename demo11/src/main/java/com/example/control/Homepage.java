package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homepage {
	@RequestMapping(path = {"123"})
	public String home(){
		System.out.println("sbzczsbzcz");
		return "home";
	}
}
