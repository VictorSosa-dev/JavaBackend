package org.java.backend.s8.persistence;

import org.java.backend.s8.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
