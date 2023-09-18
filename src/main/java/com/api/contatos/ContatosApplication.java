package com.api.contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);
	}

	@GetMapping("/")
	public String olaMundo() {
		return "Ola Mundo! ";
	}
}
