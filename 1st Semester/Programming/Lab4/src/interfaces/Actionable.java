package interfaces;
import enums.*;
import classes.*;

public interface Actionable {
    default void breakSomething(Objects obj) {
        System.out.println("ломает");
    }
    default void save(People p, BadGuys bg) {
        System.out.println("уберегает");
    }
    default void call(People p) {
        System.out.println("звонИт");
    }
    default void explain(Ideas i1, Ideas i2) {
        System.out.println("объясняет");
    }
    default void catchSomeone(People p) {
        System.out.println("ловит");
    }
    default void digToFindOut(Seed s) {
        System.out.println("копает, чтобы выяснить");
    }
    default void kuroshat() {
        System.out.println("куращает блинами");
    }
}
