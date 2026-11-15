package com.example.patronesrpg;

public class CreadorOrco extends CreadorEnemigo {
    @Override
    public Personaje crearEnemigo() {
        Personaje p = new PersonajeBase("Orco Furioso", 120, 30, 8, 8);
        p.setEstrategia(new AtaqueEspada());
        return p;
    }
}