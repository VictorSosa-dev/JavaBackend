package com.java.s5.e2.service;

import com.java.s5.e2.model.SaludoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    private final SaludoComponent saludo;
    private final SaludoComponent saludo2;


    @Autowired
    public SaludoService(SaludoComponent saludo, SaludoComponent saludo2) {
        this.saludo = saludo;
        this.saludo2 = saludo2;
        System.out.println(saludo == saludo2);

    }

    public String saluda(){
        return "Hola " + saludo.getNombre();

    }
}
