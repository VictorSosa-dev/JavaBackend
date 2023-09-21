package org.java.backend.s6.e2.controllers;

import org.java.backend.s6.e1.models.Usuario;
import org.java.backend.s6.e2.models.Direccion;
import org.java.backend.s6.e2.models.UsuarioE2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/usuario")
public class UsuarioControllerE2 {


    @PostMapping
    public ResponseEntity<UsuarioE2> creaUsuario(@RequestBody UsuarioE2 usuario) {
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        Direccion direccion = new Direccion();
        direccion.setCalle("Córdoba");
        direccion.setNumero("56");
        direccion.setCodigoPostal("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }


}
