package classes;

import enums.*;
import interfaces.*;

public class ExtendedKid extends Kid implements ExtendedActionable, ExtendedEmotional, Wishable, Thinkable {
    public ExtendedKid (String name) {
        super(name);
    }
    @Override
    public  void walk(Uncle u, Structures bar) {
        System.out.printf("%s пошёл с %s в %s.%n", name, u.toString(), bar.getValue());
    }
    @Override
    public void love(Structures s) {
        System.out.printf("%s тоже очень любил %s.%n", name, s.getValue());
    }
    @Override
    public void goBack(Structures s) {
        System.out.printf("%s вернулся %s.%n", name, s.getValue());
    }
    @Override
    public void haveDinner(Housekeeper h) {
        System.out.printf("%s поужинал вместе с %s.%n", name, h);
    }
    @Override
    public void goTo(Structures s) {
        System.out.printf("%s отправился в %s.%n", name, s.getValue());
    }
    @Override
    public void scare() {
        System.out.printf("Но %s был в самом деле очень напуган.%n", name);
    }
    @Override
    public void think(Ideas i) {
        System.out.printf("%s считал, что %s.%n", name, i.getValue());
    }
    @Override
    public void hope() {
        System.out.printf("%s надеялся, что ", name);
    }
}
