package com.java.s5;

import com.java.s5.e1.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S5Application implements CommandLineRunner {

	//@Autowired
	private final Saludo saludo;

	public S5Application(@Autowired Saludo saludo) {
		this.saludo = saludo;
	}

	/*
	@Autowired
	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(S5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.getNombre());
	}
}
