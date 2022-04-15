package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {

    public Rest() { super(Type.PSYCHIC, 0,0); }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e1 = new Effect().turns(0).stat(Stat.HP, (int) p.getStat(Stat.HP));
        Effect e2 = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e1);
        p.setCondition(e2);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
