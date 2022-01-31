package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

// https://pokemondb.net/pokedex/hitmonlee

public class Hitmonlee extends Pokemon {
    public Hitmonlee(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(50, 120, 53, 35, 110, 87);
        setMove(new Facade(), new Rest(), new DefenseCurl());
    }
}
