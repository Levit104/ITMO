package interfaces;

public interface Wishable {
    default void want() {
        System.out.println("хочет");
    }
    default void hope() {
        System.out.println("надеется");
    }
}
