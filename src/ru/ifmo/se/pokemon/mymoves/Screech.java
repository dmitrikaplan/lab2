package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {

    public Screech(){ super(Type.NORMAL, 0 , 85);}

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.DEFENSE, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe(){ return "использует Screech";}

}
