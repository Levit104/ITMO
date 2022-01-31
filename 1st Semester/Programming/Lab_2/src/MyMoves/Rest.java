package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/rest

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect sleepTurns = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.addEffect(sleepTurns);
    }
    
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    
    @Override
    protected String describe() {
        return "использует способность \"Отдых\"";
    }
}
