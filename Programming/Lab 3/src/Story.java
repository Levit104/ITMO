public class Story {
    public static void main(String[] args) {
        Kid kid = new Kid("Малыш");
        kid.NotHappy(People.SOMEONE);
        kid.Sigh();
        kid.Break(Objects.HEAD);
        kid.Save(People.CARLSON, People.BAD_GUYS);
        kid.Call(Objects.POLICE);
        kid.Explain(People.CARLSON, People.BAD_GUYS, Ideas.BAD, Ideas.DANGEROUS);
    }
}
