package com.java.postwork.s4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class S4Application implements org.springframework.boot.CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(S4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);


		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();


		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();
		Persona persona = new Persona(nombre, telefono);


		System.out.println(persona);

	}
}
