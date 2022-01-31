package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/defense-curl

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL, 0, 0);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    
    @Override
    protected String describe() {
        return "использует способность \"Защитный вихрь\"";
    }
}
