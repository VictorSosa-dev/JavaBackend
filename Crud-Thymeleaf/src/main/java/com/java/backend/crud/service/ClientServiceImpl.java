package com.java.backend.crud.service;

import com.java.backend.crud.model.Client;
import com.java.backend.crud.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IclientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public String createClient(Client client) {
        clientRepository.save(client);
        return "Client created";
    }

    @Override
    public String updateClient(Long id, Client client) {
        Client clientToUpdate = clientRepository.findById(id).orElse(null);
        if (clientToUpdate == null) {
            return "Client not found";
        }
        clientToUpdate.setName(client.getName());
        clientToUpdate.setLastName(client.getLastName());
        clientToUpdate.setEmail(client.getEmail());
        clientToUpdate.setBirthday(client.getBirthday());
        clientRepository.save(clientToUpdate);
        return "Client updated";
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteClient(Long id) {
        Client clientToDelete = clientRepository.findById(id).orElse(null);
        if (clientToDelete == null) {
            return "Client not found";
        }
        clientRepository.delete(clientToDelete);
        return "Client deleted";
    }
}
