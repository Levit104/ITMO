package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/calm-mind

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    
    @Override
    protected String describe() {
        return "использует способность \"Спокойный разум\"";
    }
}
