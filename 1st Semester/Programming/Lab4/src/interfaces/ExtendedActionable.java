package interfaces;
import enums.*;
import classes.*;

public interface ExtendedActionable extends Actionable{
    default void beAbsent(AmountOfTime aot) {
        System.out.println("отсутствует");
    }
    default void notShowUp() {
        System.out.println("не показывается");
    }
    default void waitSomeone(ExtendedKid ek) {
        System.out.println("ждёт");
    }
    default void stand() {
        System.out.println("стоит");
    }
    default void say(ExtendedKid ek, Ideas i1, Ideas i2) {
        System.out.println("говорит");
    }
    default void moveAway() {
        System.out.println("отходит");
    }
    default void haveDinner(Housekeeper h) {
        System.out.println("ужинает");
    }
    default void walk(Uncle u, Structures s) {
        System.out.println("ходит");
    }
    default void goBack(Structures s) {
        System.out.println("возвращается");
    }
    default void goTo(Structures s) {
        System.out.println("отправляется");
    }
    default void hideAndSit(Structures s) {
        System.out.println("прячется и сидит");
    }
    default void notBreakSomething(Objects obj) {
        System.out.println("не ломает");
    }
}
