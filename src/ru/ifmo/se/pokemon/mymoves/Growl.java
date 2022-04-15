package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {

    public Growl(){ super(Type.NORMAL, 0,100); }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().stat(Stat.ATTACK, -1));

    }
    @Override
    protected String describe(){ return "использует Growl"; }
}
