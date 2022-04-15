package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.mymoves.DoubleTeam;
import ru.ifmo.se.pokemon.mymoves.Rest;

public class Goomy extends Pokemon {

    public Goomy(String name, int level){

        super(name, level); // имя и уровень покемона
        super.setType(Type.DRAGON); // добавляем тип покемона
        super.setStats(45, 50, 35, 55, 75, 40); // добавляем характеристики покемона

        // добавляем атаки покемона
        Rest rest = new Rest();
        DoubleTeam doubleteam = new DoubleTeam();
        super.setMove(rest, doubleteam);

    }
}
