public class Story {
    public static void main(String[] args) {
        Kid kid = new Kid("Малыш");
        BadGuys robbers = new BadGuys("Филле и Рулле");
        kid.notHappy(People.SOMEONE);
        kid.sigh();
        kid.breakSomething(Objects.HEAD);
        kid.save(People.CARLSON, robbers);
        robbers.catchSomeone(People.CARLSON);
        kid.call(People.POLICE);
        kid.explain(Ideas.BAD, Ideas.DANGEROUS);
    }
}
