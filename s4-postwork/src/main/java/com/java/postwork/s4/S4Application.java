package com.java.postwork.s4;

import com.java.postwork.s4.model.Person;
import com.java.postwork.s4.utils.CheckNumber;
import com.java.postwork.s4.utils.NumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class S4Application implements org.springframework.boot.CommandLineRunner {

	private CheckNumber checkNumber;
	private NumberFormatter numberFormatter;

	@Autowired
	public S4Application(CheckNumber checkNumber, NumberFormatter numberFormatter) {
		this.checkNumber = checkNumber;
		this.numberFormatter = numberFormatter;
	}

	public static void main(String[] args) {
		SpringApplication.run(S4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);


		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();


		System.out.println("Introduce el teléfono: ");
		String phone = reader.nextLine();


		if (checkNumber.isValid(phone)) {
			phone = checkNumber.cleanNumber(phone);
			phone = numberFormatter.format(phone);


			Person persona = new Person(nombre, phone);


			System.out.println(persona);
		} else {
			System.out.println("Por favor, introduce un número válido");
		}
	}
}
