package com.example.patronesrpg;

public class EspadaDecorator extends PersonajeDecorator {
    public EspadaDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 10;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Espada";
    }
}