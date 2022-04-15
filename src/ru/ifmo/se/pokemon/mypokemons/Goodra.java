package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.mymoves.ShadowBall;

//Sliggoo эволюционирует в Goodra, тем самым Goodra наследует тип и атаки Sliggoo
public class Goodra extends Sliggoo{

    public Goodra(String name, int level) {

        super(name, level);// имя и уровень покемона
        super.setStats(90, 100, 70, 110, 150, 80);// добавляем характеристики покемона

        //добавляем атаки покемона
        ShadowBall shadowball = new ShadowBall();
        super.addMove(shadowball);

    }
}
