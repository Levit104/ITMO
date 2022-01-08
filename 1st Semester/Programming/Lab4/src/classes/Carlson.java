package classes;

import enums.*;
import interfaces.*;

public class Carlson extends Human implements ExtendedActionable, ExtendedEmotional, Thinkable, Wishable {
    public Carlson(String name) {
        this.name = name;
    }
    @Override
    public void beAbsent(AmountOfTime aot) {
        System.out.printf("%s отсутствовал %s.%n", name, aot.getValue());
    }
    @Override
    public void want() {
        System.out.printf("Видно, %s хотел, чтобы ", name);
    }
    @Override
    public void notShowUp() {
        System.out.printf("Все шло чин чином - %s не показывался.%n", name);
    }
    @Override
    public void waitSomeone(ExtendedKid ek) {
        System.out.printf("%s ждал %s.%n", name, ek);
    }
    @Override
    public void notBreakSomething(Objects obj) {
        System.out.printf("А вот %s не ломал себе голову, и ", name);
    }
    @Override
    public void notScare() {
        System.out.printf("%s не боялся.%n", name);
    }
    @Override
    public void stand() {
        class Window {
            final static String name = "окно";
        }
        System.out.printf("%s стоял у %s.%n", name, Window.name);
    }
    @Override
    public  void hideAndSit(Structures s) {
        System.out.printf("%s просидит эту ночь у себя в %s, что %s притаится как мышь.%n", name, s.getValue(), name);
    }
    @Override
    public void say(ExtendedKid ek, Ideas i1, Ideas i2) {
        System.out.printf("Но %s сказал %s, что из %s, которые ему давали, %s.%n",
                name, ek, i1.getValue(), i2.getValue());
    }
    @Override
    public void digToFindOut(Seed s) throws MyException.GrowException {
        if (s.getStatus()) {
            System.out.printf("%s с невозмутимым спокойствием выкапывал %s, чтобы очередной раз выяснить," +
                    "%n насколько %s%s.%n", name, s, s, s.getDescription());
        }
        else {
            System.out.printf("%s с невозмутимым спокойствием выкапывал %s, и выяснил, что %s%s.%n",
                    name, s, s, s.getDescription());
            throw new MyException.GrowException("Косточка не проросла");
        }
    }
    @Override
    public void kuroshat() {
        System.out.printf("%s делает курощение блинами.%n", name);
    }
}
