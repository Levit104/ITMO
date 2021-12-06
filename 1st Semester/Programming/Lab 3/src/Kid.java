public class Kid extends Human{
    public Kid (String name) {
        this.name = name;
    }
    @Override
    public void notHappy(People p) {
        System.out.println("По правде говоря, " + name + " " + p.getValue() + " даже не обрадовался.");
    }
    @Override
    public void sigh() {
        System.out.println(name + " вздохнул.");
    }
    @Override
    public void breakSomething(Objects obj) {
        System.out.print("Весь день " + name + " ломал себе " + obj.getValue() + ",");
    }
    @Override
    public void save(People p, BadGuys bg) {
        System.out.println(" как уберечь " + p.getValue() + " от " + bg + ".");
    }
    @Override
    public void call(People p) {
        System.out.println("Может, надо позвонить в " + p.getValue() + "?");
    }
    @Override
    public void explain(Ideas i1, Ideas i2) {
        System.out.println(i1.getValue() + ", потому что тогда придется объяснять почему, а " + i2.getValue() + ".");
    }
}
