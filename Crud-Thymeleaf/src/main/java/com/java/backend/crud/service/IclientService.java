package com.java.backend.crud.service;

import com.java.backend.crud.model.Client;

import java.util.List;

public interface IclientService {

    public List<Client> getAllClients();

    public String createClient(Client client);

    public String updateClient(Long id, Client client);

    public Client getClient(Long id);
    public String deleteClient(Long id);
}
