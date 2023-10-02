package com.java.backend.crud.persistence;

import com.java.backend.crud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
