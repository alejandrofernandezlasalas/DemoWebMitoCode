package com.mitocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/saludo")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model){
		
		//Al modelo le estamos agregando un atributo
		model.addAttribute("name", name);
		
		//Hace mencion a la pagina en la que quieres manejar
		return "greeting";
	}
}