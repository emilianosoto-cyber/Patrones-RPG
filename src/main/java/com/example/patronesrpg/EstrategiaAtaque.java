package com.example.patronesrpg;

public interface EstrategiaAtaque {
    ResultadoAtaque atacar(Personaje atacante, Personaje objetivo);
}