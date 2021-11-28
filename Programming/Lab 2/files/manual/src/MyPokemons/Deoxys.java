package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;
// https://pokemondb.net/pokedex/deoxys

public class Deoxys extends Pokemon {
    public Deoxys(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(50, 150, 50, 150, 50, 150);
        setMove(new IceBeam(), new WakeUpSlap(), new AquaRing(), new CalmMind());
    }
}
