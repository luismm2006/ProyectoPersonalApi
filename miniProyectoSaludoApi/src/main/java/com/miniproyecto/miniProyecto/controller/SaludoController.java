package com.miniproyecto.miniProyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	@GetMapping("/saludo/{nombre}/{edad}")
	public String saludoNombreEdad(@PathVariable String nombre, @PathVariable int edad) {
		return "Hola, soy: " + nombre + " y tengo: " + edad;
	}
}
