package com.lista1.lista1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exerc1 {
	@GetMapping ("/mentalidadeHabilidade")
	
	public String mentalidadeHabilidade() {
		return "Mentalidade: Persintência \nHabilidade: Atenção aos Detalhes";	
	}
	
}
