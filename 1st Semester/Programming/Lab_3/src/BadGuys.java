public class BadGuys extends Human {
    public BadGuys(String name) {
        this.name = name;
    }
    
    @Override
    public void catchSomeone(People p) {
        System.out.printf("%s хотят поймать %s.%n", name, p.getValue());
    }
}
