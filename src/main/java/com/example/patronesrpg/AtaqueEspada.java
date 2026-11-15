package com.example.patronesrpg;

public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public ResultadoAtaque atacar(Personaje atacante, Personaje objetivo) {
        int danoCalculado = (int) (atacante.getAtaque() * 1.5);
        boolean critico = Math.random() > 0.8;
        if (critico) danoCalculado *= 2;
        return new ResultadoAtaque(danoCalculado, critico, "corte de espada");
    }
}