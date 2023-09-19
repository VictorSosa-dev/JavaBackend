package com.java.s5;

import com.java.s5.e3.service.SaludoServiceE3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S5Application implements CommandLineRunner {

	/* E1
	@Autowired
	private final Saludo saludo;


	public S5Application(@Autowired Saludo saludo) {
		this.saludo = saludo;
	}

	@Autowired
	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.getNombre());
	}*/

	//e2
	/*
	private final SaludoService saludoService;

	@Autowired
	public S5Application(SaludoService saludoService) {
		this.saludoService = saludoService;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}*/

	//e3
	private final SaludoServiceE3 saludoService;

	@Autowired
	public S5Application(SaludoServiceE3 saludoService) {
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(S5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}

}
