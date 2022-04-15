package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.mymoves.IceBeam;

// Omanyte эволюционирует в Omastar, тем самым Omastar наследует его тип и атаки
public class Omastar extends Omanyte{

    public Omastar(String name, int level) {

        super(name, level); // имя и уровень покемона
        super.setStats(70,60,125,115,70,55); // добавляем характеристики покемона

        //добавляем атаки
        IceBeam icebeam = new IceBeam();
        super.addMove(icebeam);

    }
}
