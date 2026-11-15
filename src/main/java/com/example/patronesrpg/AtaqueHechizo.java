package com.example.patronesrpg;

public class AtaqueHechizo implements EstrategiaAtaque {
    @Override
    public ResultadoAtaque atacar(Personaje atacante, Personaje objetivo) {
        int danoCalculado = atacante.getAtaque() * 2;
        return new ResultadoAtaque(danoCalculado, false, "hechizo");
    }
}