package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/stun-spore

public class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0, 75);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    
    @Override
    protected String describe() {
        return "парализует цель при попадании";
    }
}
