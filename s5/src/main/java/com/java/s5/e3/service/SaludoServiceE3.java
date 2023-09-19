package com.java.s5.e3.service;

import com.java.s5.e3.model.SaludoE3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SaludoServiceE3 {

    private final SaludoE3 saludo;

    @PostConstruct
    public void init(){
        saludo.setNombre("Beto");
    }

    @Autowired
    public SaludoServiceE3(SaludoE3 saludo) {
        this.saludo = saludo;
    }

    public String saluda(){
        return "Hola " + saludo.getNombre();
    }
}
