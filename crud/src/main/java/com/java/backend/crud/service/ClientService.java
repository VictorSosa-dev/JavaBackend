package com.java.backend.crud.service;

import com.java.backend.crud.model.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAllClients();

    public String createClient(Client client);

    public String updateClient(Long id, Client client);

    public String deleteClient(Long id);
}
