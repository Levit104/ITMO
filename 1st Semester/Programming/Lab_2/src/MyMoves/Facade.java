package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/facade

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    protected boolean checkCond;
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        checkCond = false;
        Status cond = def.getCondition();
        if (cond.equals(Status.BURN) || cond.equals(Status.POISON) || cond.equals(Status.PARALYZE)) {
           def.setMod(Stat.HP, (int) Math.round(damage) * 2);
            checkCond = true;
        }
    }
    @Override
    protected String describe() {
        if (checkCond) return "атакует с двойной силой";
        else return "атакует с обычной силой";
    }
}
