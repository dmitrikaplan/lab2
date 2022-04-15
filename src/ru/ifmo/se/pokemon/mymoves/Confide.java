package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(){ super(Type.NORMAL, 0, 0); }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));

    }

    @Override
    protected String describe(){ return "использует Confide"; }
}
