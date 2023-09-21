package org.java.backend.s6.e1.controllers;

import org.java.backend.s6.e1.models.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {


    @PostMapping("/registro")
    public String registro(@RequestBody Usuario usuario) {
        System.out.println(usuario.toString());
        return "Usuario registrado exitosamente";
    }
    
    @PostMapping("/{id}")
    public String creaUsuario(@PathVariable("id") String id, @RequestBody Usuario usuario) {
        System.out.println(usuario.toString());
        return "Usuario registrado exitosamente con id: " + id;
    }

    @PostMapping
    public String creaUsuario(@RequestBody Usuario usuario,@RequestParam("id") long id,@RequestParam("rol") String rol) {
        System.out.println(usuario.toString());
        return "Usuario registrado exitosamente con id: " + id + " y rol: " + rol;
    }
}
