package com.example.patronesrpg;

public abstract class CreadorPersonaje {
    public abstract Personaje crearPersonaje(String nombre);

    protected void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }
}