package com.example.patronesrpg;

public class BendicionDecorator extends PersonajeDecorator {
    public BendicionDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getAtaque() {
        return (int) (super.getAtaque() * 1.15);
    }

    @Override
    public int getDefensa() {
        return (int) (super.getDefensa() * 1.15);
    }

    @Override
    public int getVelocidad() {
        return (int) (super.getVelocidad() * 1.15);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Bendición";
    }
}