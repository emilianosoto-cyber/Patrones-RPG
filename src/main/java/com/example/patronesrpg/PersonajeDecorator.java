package com.example.patronesrpg;

public abstract class PersonajeDecorator implements Personaje {
    protected final Personaje personaje;

    public PersonajeDecorator(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override public String getNombre() { return personaje.getNombre(); }
    @Override public int getAtaque() { return personaje.getAtaque(); }
    @Override public int getDefensa() { return personaje.getDefensa(); }
    @Override public int getVelocidad() { return personaje.getVelocidad(); }
    @Override public int getHp() { return personaje.getHp(); }

    @Override
    public void setHp(int hp) { personaje.setHp(hp); }

    @Override public EstrategiaAtaque getEstrategia() { return personaje.getEstrategia(); }

    @Override
    public void setEstrategia(EstrategiaAtaque e) { personaje.setEstrategia(e); }

    @Override
    public ResultadoAtaque atacar(Personaje objetivo) {
        return personaje.atacar(objetivo);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion();
    }
}