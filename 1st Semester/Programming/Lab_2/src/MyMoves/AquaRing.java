package MyMoves;

import ru.ifmo.se.pokemon.*;

// https://pokemondb.net/move/aqua-ring

public class AquaRing extends StatusMove {
    public AquaRing() {
        super(Type.WATER, 0, 0);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -(int) (p.getHP() * (1.0/16)));
    }
    
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    
    @Override
    protected String describe() {
        return "восстанавливает 1/16 своего здоровья";
    }
}
