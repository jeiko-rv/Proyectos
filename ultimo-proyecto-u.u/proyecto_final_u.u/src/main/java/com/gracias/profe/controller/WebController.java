package com.gracias.profe.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan(basePackages = "com.gracias.profe")
public class WebController {

	
	@GetMapping("/login")
	public String getIndex() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String getLogout() {
		return "logout";
	}
	
	@GetMapping("/servicioturismo")
	public String getServicioTurismo() {
		return "servicioturismo";
	}
	
	@GetMapping("/serviciopremium")
	public String getServicioPremium() {
		return "serviciopremium";
	}
	
	@GetMapping("/")
	public String getLog(Authentication auth) {
		if (auth.getAuthorities().contains(new SimpleGrantedAuthority("admin"))) {
			return "indexAdmin";
		} else if (auth.getAuthorities().contains(new SimpleGrantedAuthority("usertur")))  {
			return "servicioturismo";
		}else {
			return "serviciopremium";
		}
		
	}
	
}
