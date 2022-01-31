package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/wake-up-slap

public class WakeUpSlap extends PhysicalMove{
    public WakeUpSlap() {
        super(Type.FIGHTING, 70, 100);
    }
    
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status cond = def.getCondition();
        if (cond.equals(Status.SLEEP)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        Status cond = p.getCondition();
        if (cond.equals(Status.SLEEP)) {
            Effect notSleep = new Effect().condition(Status.NORMAL);
            p.setCondition(notSleep);
        }
    }
    
    @Override
    protected String describe() {
        return "наносит двойной урон, если цель спит, но при этом пробуждает ее";
    }
}
