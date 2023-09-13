package org.java.backend.s4.controllers;

import org.java.backend.s4.models.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saluda() {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo!");
        return saludo;
    }

    @GetMapping("/saludo/{nombre}")
    public String saluda(@PathVariable String nombre) {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola " + nombre + "!");
        return saludo.getMensaje();
    }

    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo) {

        return saludo;
    }

    @PutMapping("/saludo")
    public Saludo saludaPut(@RequestBody Saludo saludo) {
        saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));
        return saludo;
    }
}
