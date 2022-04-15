package ru.ifmo.se.pokemon.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.mymoves.AcidSpray;
import ru.ifmo.se.pokemon.mymoves.Confide;
import ru.ifmo.se.pokemon.mymoves.Screech;
import ru.ifmo.se.pokemon.mymoves.ShadowPunch;



public class Lugia extends Pokemon {

        public Lugia(String name, int level){

            super(name,level); // имя и уровень покемона
            super.setType(Type.PSYCHIC, Type.FLYING); //добавляем типы покемона
            super.setStats(106, 90, 130, 90, 154, 110); //добавляем характеристики покемона

            //добавляем специальные атаки
            Confide confide = new Confide();
            ShadowPunch shadowpunch = new ShadowPunch();
            AcidSpray acidspray = new AcidSpray();
            Screech screech = new Screech();
            super.setMove(confide, shadowpunch, acidspray, screech);

        }
    }
