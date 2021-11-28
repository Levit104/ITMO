package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;
// https://pokemondb.net/pokedex/hitmonchan

public class Hitmonchan extends Pokemon {
    public Hitmonchan(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(50, 105, 79, 35, 110, 76);
        setMove(new Facade(), new Rest(), new DefenseCurl(), new Thunder());
    }
}
