package org.java.backend.s8.controllers;

import org.java.backend.s8.models.Producto;
import org.java.backend.s8.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public ResponseEntity<Void> crearProducto(@RequestBody Producto producto) {
        Producto productoDB = productoRepository.save(producto);
        return ResponseEntity.created(URI.create(productoDB.getId().toString())).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Producto productoDB = productoRepository.findById(id).orElse(null);
        return ResponseEntity.ok(productoDB);
    }

}
