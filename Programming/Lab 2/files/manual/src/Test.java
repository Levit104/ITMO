public class Test {
    public static void main(String[] args) {
        Animal test1 = new Animal();
        test1.voice();
        Animal test2 = new Cat();
        test2.voice();
        Cat test3 = new Cat();
        test3.voice();
    }
}

class Animal {
    void voice() {
        System.out.println("VOICE");
    }
}

class Cat extends Animal {
    @Override
    void voice() {
        System.out.println("MEOW");
    }
}
