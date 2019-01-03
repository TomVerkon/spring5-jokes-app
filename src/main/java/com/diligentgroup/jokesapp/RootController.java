package com.diligentgroup.jokesapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diligentgroup.jokesapp.services.JokesService;

@Controller
public class RootController {
	
	private JokesService jokesService;
	
	public RootController(JokesService  jokesService) {
		this.jokesService = jokesService;
	}
	
	@RequestMapping("/")
	String getJoke(Model model) {
		model.addAttribute("joke", jokesService.getRandomQuote());
		return "chucknorris";
	}

}
