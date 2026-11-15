package com.example.patronesrpg;

public class Main {
    public static void main(String[] args) {
        // --- EJECUCIÓN 1: Mago (Replicando la imagen de salida esperada) ---
        System.out.println("--- CORRIDA 1 ---");
        CreadorPersonaje creadorMago = new CreadorMago();
        Personaje aria = creadorMago.crearPersonaje("Aria");
        aria = new EspadaDecorator(aria);
        aria = new VenenoDecorator(aria);
        aria = new BendicionDecorator(aria);

        System.out.println("Héroe: " + aria.getDescripcion());
        System.out.println("ATK: " + aria.getAtaque() + " | DEF: " + aria.getDefensa()
                + " | VEL: " + aria.getVelocidad() + " | HP: " + aria.getHp());

        CreadorEnemigo creadorGoblin = new CreadorGoblin();
        Personaje goblin = creadorGoblin.crearEnemigo();
        System.out.println("Enemigo: " + goblin.getNombre() + " | HP: " + goblin.getHp());

        new MotorCombate().iniciarCombate(aria, goblin);

        // --- EJECUCIÓN 2: Guerrero sin veneno vs Orco ---
        System.out.println("\n\n--- CORRIDA 2 ---");
        CreadorPersonaje creadorGuerrero = new CreadorGuerrero();
        Personaje garen = creadorGuerrero.crearPersonaje("Garen");
        garen = new EspadaDecorator(garen);
        garen = new BendicionDecorator(garen); // Sin veneno

        CreadorEnemigo creadorOrco = new CreadorOrco();
        Personaje orco = creadorOrco.crearEnemigo();

        new MotorCombate().iniciarCombate(garen, orco);

        // --- EJECUCIÓN 3: Mago solo con Espada vs Goblin ---
        System.out.println("\n\n--- CORRIDA 3 ---");
        Personaje merlin = creadorMago.crearPersonaje("Merlin");
        merlin = new EspadaDecorator(merlin);

        Personaje goblin2 = creadorGoblin.crearEnemigo();

        new MotorCombate().iniciarCombate(merlin, goblin2);
    }
}