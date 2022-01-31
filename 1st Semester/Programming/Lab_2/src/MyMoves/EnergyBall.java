package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/energy-ball

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    
    @Override
    protected String describe() {
        return "атакует и имеет 10% шанс снизить спец. защиту цели на одну ступень";
    }
}
