package com.example.patronesrpg;

public class CreadorGuerrero extends CreadorPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        validarNombre(nombre);
        Personaje p = new PersonajeBase(nombre + " (Guerrero)", 150, 25, 15, 10);
        p.setEstrategia(new AtaqueEspada());
        return p;
    }
}