package com.registro.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/NewFile")
	public String NewFile() {
		return "NewFile";
	}
}
