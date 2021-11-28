package MyMoves;

import ru.ifmo.se.pokemon.*;
// https://pokemondb.net/move/sleep-powder

public class SleepPowder extends StatusMove {
    public SleepPowder() {
        super(Type.GRASS, 0, 75);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
    @Override
    protected String describe() {
        return "усыпляет цель при попадании";
    }
}
