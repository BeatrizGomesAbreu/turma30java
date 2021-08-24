package com.lista1.lista1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exerc2 {
@GetMapping ("/ObjetivosAprendizagem")

public String ObjetivosAprendizagem() {
	return "Procuro deseonvolver minha habilidade em atenção aos detales e focar no que estou fazendo no momneto";
}
	
}
