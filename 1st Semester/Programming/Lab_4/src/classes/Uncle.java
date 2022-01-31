package classes;

import enums.*;
import interfaces.*;

public class Uncle extends Human implements ExtendedActionable, ExtendedEmotional {
    public Uncle(String name) {
        this.name = name;
    }
    
    @Override
    public void love(Structures s) {
        System.out.printf("%s очень любил %s, и ", name, s.getValue());
    }
    
    @Override
    public void goBack(Structures s) {
        System.out.printf("%s вернулся %s, и ", name, s.getValue());
    }
    
    @Override
    public void haveDinner(Housekeeper h) {
        System.out.printf("%s поужинал вместе с %s, и ", name, h.toString());
    }
}
