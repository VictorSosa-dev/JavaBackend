package org.java.backend.s8.controllers;

import org.java.backend.s8.models.Cliente;
import org.java.backend.s8.models.Producto;
import org.java.backend.s8.persistence.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ResponseEntity<Void> crearCliente(@RequestBody Cliente cliente) {
        Cliente clienteDB = clienteRepository.save(cliente);
        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
    }

}
