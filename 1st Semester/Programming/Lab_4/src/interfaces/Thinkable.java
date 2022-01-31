package interfaces;
import enums.*;

public interface Thinkable {
    default void think(Ideas i) {
        System.out.println("считает");
    }
}
