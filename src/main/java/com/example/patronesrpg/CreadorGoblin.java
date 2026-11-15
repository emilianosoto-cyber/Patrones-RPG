package com.example.patronesrpg;

public class CreadorGoblin extends CreadorEnemigo {
    @Override
    public Personaje crearEnemigo() {
        Personaje p = new PersonajeBase("Goblin salvaje", 60, 15, 5, 20);
        p.setEstrategia(new AtaquePunalada());
        return p;
    }
}