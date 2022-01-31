import classes.*;
import enums.*;
import interfaces.*;

public class Story {
    public static void main(String[] args) throws MyException.StoryException {
        /*
        Kid kid = new Kid("Малыш");
        BadGuys robbers = new BadGuys("Филле и Рулле");
        kid.notHappy(People.SOMEONE);
        kid.sigh();
        kid.breakSomething(Objects.HEAD);
        kid.save(People.CARLSON, robbers);
        robbers.catchSomeone(People.CARLSON);
        kid.call(People.POLICE);
        kid.explain(Ideas.BAD, Ideas.DANGEROUS);
        */

        StoryControl story = new StoryControl() {
            @Override
            public void start() {
                System.out.println("Старт истории!");
            }
            @Override
            public void end() {
                System.out.println("Конец истории!");
            }
        };

        story.start();

        try {
            TimeOfDay tod = new TimeOfDay();
            TimeOfDay.Dusk dusk = tod.new Dusk();
            Carlson carlson = new Carlson("Карлсон");
            Housekeeper frakenBock = new Housekeeper("фрекен Бок");
            ExtendedKid kid = new ExtendedKid("Малыш");
            //ExtendedKid badKid = (ExtendedKid) new Kid("Малыш");                // ОШИБКА
            Uncle uncleJulius = new Uncle("Дядя Юлиус");
            BadGuys robbers = new BadGuys("Филле и Рулле");
            dusk.start(AmountOfTime.SLOW);                                        // вырастет или нет
            Seed seed = new Seed("персиковая косточка");
            carlson.beAbsent(AmountOfTime.WHOLE_DAY);
            carlson.kuroshat();
            carlson.want();
            frakenBock.moveAway();
            kid.walk(uncleJulius, Structures.MUSEUM);
            uncleJulius.love(Structures.MUSEUM);
            kid.love(Structures.MUSEUM);
            uncleJulius.goBack(Structures.HOME);
            kid.goBack(Structures.HOME);
            uncleJulius.haveDinner(frakenBock);
            kid.haveDinner(frakenBock);
            carlson.notShowUp();
            kid.goTo(Structures.KID_ROOM);
            carlson.waitSomeone(kid);

            kid.notHappy(People.SOMEONE);
            kid.sigh();
            kid.breakSomething(Objects.HEAD);
            kid.save(People.CARLSON, robbers);
            robbers.catchSomeone(People.CARLSON);
            kid.call(People.POLICE);
            kid.explain(Ideas.BAD, Ideas.DANGEROUS);

            carlson.notBreakSomething(Objects.HEAD);
            carlson.notScare();
            carlson.stand();
            carlson.digToFindOut(seed);
            kid.scare();
            kid.think(Ideas.BEST);
            kid.hope();
            carlson.hideAndSit(Structures.CARLSON_HOUSE);
            carlson.say(kid, Ideas.ALL_WORST, Ideas.THIS_WORST);
        }
        catch (Exception e) {
            System.err.println("ОШИБКА!");
            throw new MyException.StoryException(e.getMessage());
        }
        finally {
            story.end();
        }
    }
}
