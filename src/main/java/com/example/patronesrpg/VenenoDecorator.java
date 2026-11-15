package com.example.patronesrpg;

public class VenenoDecorator extends PersonajeDecorator {
    public VenenoDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 5;
    }

    @Override
    public ResultadoAtaque atacar(Personaje objetivo) {
        ResultadoAtaque base = super.atacar(objetivo);
        return new ResultadoAtaque(base.getDano(), base.isCritico(), base.getEfecto() + " + veneno");
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Veneno";
    }
}