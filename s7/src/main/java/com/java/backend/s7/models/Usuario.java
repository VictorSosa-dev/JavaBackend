package com.java.backend.s7.models;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class Usuario {
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank
    @Email(message = "El email debe ser válido")
    private String email;

    @NotBlank
    @Length(min = 3, max = 20, message = "El username debe tener entre 3 y 20 caracteres")
    private String username;

    @NotBlank
    private String rol;

    @NotBlank(message = "La contraseña no puede estar vacía")
    private String password;

    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe ser válido")
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
