package interfaces;
import enums.*;

public interface ExtendedEmotional extends Emotional{
    default void notScare() {
        System.out.println("не боится");
    }
    default void scare() {
        System.out.println("боится");
    }
    default void love(Structures s) {
        System.out.println("любит");
    }
}
