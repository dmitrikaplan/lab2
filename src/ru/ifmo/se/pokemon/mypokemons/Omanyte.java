package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.mymoves.DazzlingGleam;
import ru.ifmo.se.pokemon.mymoves.Facade;
import ru.ifmo.se.pokemon.mymoves.ShadowBall;

public class Omanyte extends Pokemon{

    public Omanyte(String name, int level){

        super(name,level); // имя и уровень покемона
        super.setType(Type.ROCK, Type.WATER); // добавляем типы покемона
        super.setStats(35, 40, 100, 90, 55, 35); //добавляем характеристики покемона

        //добавляем атаки
        Facade facade = new Facade();
        ShadowBall shadowball = new ShadowBall();
        DazzlingGleam dazzlinggleam = new DazzlingGleam();
        super.setMove(facade, shadowball,dazzlinggleam);

    }

}
