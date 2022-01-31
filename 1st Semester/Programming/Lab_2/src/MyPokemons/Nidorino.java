package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

// https://pokemondb.net/pokedex/nidorino

public class Nidorino extends Pokemon {
    public Nidorino(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(61, 72, 57, 55, 55, 65);
        setMove(new PoisonJab(), new EnergyBall(), new StunSpore());
    }
}
