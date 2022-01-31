package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/ice-beam

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.freeze(p);
    }
    
    @Override
    protected String describe() {
        return "атакует и имеет 10% шанс заморозить цель";
    }
}
