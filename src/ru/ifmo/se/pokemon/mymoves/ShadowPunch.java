package ru.ifmo.se.pokemon.mymoves;

import ru.ifmo.se.pokemon.*;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class ShadowPunch extends PhysicalMove {

    public ShadowPunch() { super(Type.NORMAL, 60, Infinity); }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 0);
        p.setMod(Stat.ACCURACY, 0);
    }

    @Override
    protected String describe(){

        return "использует Shadow Punch";

    }
}
