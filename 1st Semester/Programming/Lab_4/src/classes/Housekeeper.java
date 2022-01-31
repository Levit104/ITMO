package classes;

import interfaces.*;

public class Housekeeper extends Human implements ExtendedActionable {
    public Housekeeper(String name) {
        this.name = name;
    }
    
    @Override
    public void moveAway() {
        System.out.printf("%s как следует отошла после этого.%n", name);
    }
}
