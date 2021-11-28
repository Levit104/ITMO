package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;
// https://pokemondb.net/pokedex/meowth

public class Meowth extends Pokemon {
    public Meowth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(40, 45, 35, 40, 40, 90);
        setMove(new PoisonJab(), new EnergyBall(), new StunSpore(), new SleepPowder());
    }
}
