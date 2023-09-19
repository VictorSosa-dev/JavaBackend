package com.java.postwork.s4.vista;

import java.util.Scanner;

public class Input {

    Scanner reader = new Scanner(System.in);

    public String readName() {
        System.out.println("Introduce el nombre: ");
        return reader.nextLine();
    }

    public String read() {
        System.out.println("Introduce el teléfono: ");
        int phone = reader.nextInt();
        return phone + "";
    }
}
