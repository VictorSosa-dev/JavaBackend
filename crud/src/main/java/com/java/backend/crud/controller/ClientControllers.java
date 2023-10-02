package com.java.backend.crud.controller;


import com.java.backend.crud.model.Client;
import com.java.backend.crud.persistence.ClientRepository;
import com.java.backend.crud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientControllers {

    private final ClientService clientService;

    @Autowired
    public ClientControllers(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<?> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Client client) {
        clientService.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(client));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Client client) {
        String response = clientService.updateClient(id, client);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.deleteClient(id));
    }
}
