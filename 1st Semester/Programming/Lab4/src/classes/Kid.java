package classes;

import enums.*;

public class Kid extends Human{
    public Kid (String name) {
        this.name = name;
    }
    @Override
    public void notHappy(People p) {
        System.out.printf("По правде говоря, %s %s даже не обрадовался.%n", name, p.getValue());
    }
    @Override
    public void sigh() {
        System.out.printf("%s вздохнул.%n", name);
    }
    @Override
    public void breakSomething(Objects obj) {
        System.out.printf("Весь день %s ломал себе %s,", name, obj.getValue());
    }
    @Override
    public void save(People p, BadGuys bg) {
        System.out.printf(" как уберечь %s от %s.%n", p.getValue(), bg);
    }
    @Override
    public void call(People p) {
        System.out.printf("Может, надо позвонить в %s?%n", p.getValue());
    }
    @Override
    public void explain(Ideas i1, Ideas i2) {
        System.out.printf("%s, потому что тогда придется объяснять почему, а %s.%n", i1.getValue(), i2.getValue());
    }
}
