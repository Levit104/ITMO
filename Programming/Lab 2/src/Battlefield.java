import ru.ifmo.se.pokemon.*;
import MyPokemons.*;

public class Battlefield {
    public static void main(String[] args) {
        Battle field = new Battle();
        Pokemon p1 = new Deoxys("1", 1);
        Pokemon p2 = new Hitmonlee("2", 2);
        Pokemon p3 = new Hitmonchan("3", 2);
        Pokemon p4 = new Dugtrio("4", 3);
        Pokemon p5 = new Nidorino("5", 3);
        Pokemon p6 = new Meowth("6", 3);
        field.addAlly(p1);
        field.addAlly(p3);
        field.addAlly(p5);
        field.addFoe(p2);
        field.addFoe(p4);
        field.addFoe(p6);
        field.go();
    }
}
