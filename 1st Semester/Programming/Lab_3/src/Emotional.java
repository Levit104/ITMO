public interface Emotional {
    default void notHappy(People p){
        System.out.println("не радуется");
    }
    
    default void sigh() {
        System.out.println("вздыхает");
    }
}
