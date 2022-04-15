package com.company;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.mypokemons.*;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

    public static void main(String[] args) {

        Battle battle = new Battle();

        Pokemon omanyte = new Omanyte("Omanyte", 1);
        Pokemon lugia = new Lugia("Lugia", 1);
        Pokemon omastar = new Omastar("Omastar", 1);
        Pokemon goomy = new Goomy("Goomy", 1);
        Pokemon sliggoo = new Sliggoo("Sliggoo", 1);
        Pokemon goodra = new Goodra("Goodra", 1);


        battle.addAlly(omastar);
        battle.addAlly(omanyte);
        battle.addAlly(sliggoo);

        battle.addFoe(lugia);
        battle.addFoe(goodra);
        battle.addFoe(goomy);

        battle.go();


    }
}

