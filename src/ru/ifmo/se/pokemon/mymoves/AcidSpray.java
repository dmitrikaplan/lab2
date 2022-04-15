package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {

    public AcidSpray(){ super(Type.POISON, 40, 100); }

    @Override
    protected void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -2));;

    }
    protected String describe(){return "использует Acid Spray";}



}
