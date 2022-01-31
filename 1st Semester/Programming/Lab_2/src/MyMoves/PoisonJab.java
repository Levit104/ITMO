package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/poison-jab

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.poison(p);
    }
    
    @Override
    protected String describe() {
        return "атакует и имеет 30% шанс отравить цель";
    }
}
