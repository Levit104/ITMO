package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/thunder

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.paralyze(p);
    }
    
    @Override
    protected String describe() {
        return "атакует и имеет 30% шанс парализовать цель";
    }
}
