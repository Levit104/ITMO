public class Kid extends Human{
    public Kid (String name) {
        Name = name;
    }
    @Override
    public void NotHappy(People p) {
        System.out.println("По правде говоря, " + Name + " " + p.getValue() + " даже не обрадовался.");
    }
    @Override
    public void Sigh() {
        System.out.println(Name + " вздохнул.");
    }
    @Override
    public void Break(Objects obj) {
        System.out.print("Весь день " + Name + " ломал себе " + obj.getValue() + ",");
    }
    @Override
    public void Save(People p1, People p2) {
        System.out.println(" как уберечь " + p1.getValue() + " от " + p2.getValue() + ".");
    }
    @Override
    public void Call(Objects obj) {
        System.out.println("Может, надо позвонить в " + obj.getValue() + "?");
    }
    @Override
    public void Explain(People p1, People p2, Ideas i1, Ideas i2) {
        System.out.println(i1.getValue() + ", потому что тогда придется объяснять, " +
                "почему " + p2.getValue() + " хотят поймать " + p1.getValue() + ", а " + i2.getValue() + ".");
    }
}