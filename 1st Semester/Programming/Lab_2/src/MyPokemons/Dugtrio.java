package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

// https://pokemondb.net/pokedex/dugtrio

public class Dugtrio extends Pokemon {
    public Dugtrio(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(35, 100, 50, 50, 70, 120);
        setMove(new PoisonJab(), new EnergyBall());
    }
}
