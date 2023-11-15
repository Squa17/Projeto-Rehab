package br.com.rehab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
 
	@GetMapping("/index")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Helloooo!");
		return "index";
	}
}