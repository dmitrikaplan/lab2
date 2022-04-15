package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam(){ super(Type.ICE, 90, 100); }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));

    }

    @Override
    protected String describe(){ return "использует Ice Beam"; }
}
