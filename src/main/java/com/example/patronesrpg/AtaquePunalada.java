package com.example.patronesrpg;

public class AtaquePunalada implements EstrategiaAtaque {
    @Override
    public ResultadoAtaque atacar(Personaje atacante, Personaje objetivo) {
        int danoCalculado = atacante.getAtaque();
        return new ResultadoAtaque(danoCalculado, false, "puñalada");
    }
}