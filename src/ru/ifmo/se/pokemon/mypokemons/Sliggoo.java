package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.mymoves.Growl;

// Goomy эволюционирует в Sliggoo, тем самым Sliggoo наследует типы и атаки Goomy
public class Sliggoo extends Goomy{

    public Sliggoo(String name, int level) {

        super(name, level); // имя и тип покемона
        super.setStats(68,75,53, 83,113, 60); //добавляем характеристики покемона

        // добавляем специальную атаку
        Growl growl = new Growl();
        super.addMove(growl);

    }
}
