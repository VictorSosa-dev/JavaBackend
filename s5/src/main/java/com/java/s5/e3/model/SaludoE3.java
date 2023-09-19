package com.java.s5.e3.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoE3 {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

