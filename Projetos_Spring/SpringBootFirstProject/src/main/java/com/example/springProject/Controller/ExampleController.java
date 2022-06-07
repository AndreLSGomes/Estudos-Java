package com.example.springProject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Esta annotation indica que esta classe será um Controller
@RestController

// Esta anotation estabelece um endereço para o browser exibir a saída
@RequestMapping("api/exemplo")

public class ExampleController {
	
	/*
		Esta annotation complementa o endereço para se visualizar a saída deste programa
		http://localhost:8080/api/exemplo/ola-mundo/
	*/
	@GetMapping("/ola-mundo")
	
	// Méotodo get do tipo Responseentity 'String'
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Olá mundo Spring MVC / Boot");
	}

}