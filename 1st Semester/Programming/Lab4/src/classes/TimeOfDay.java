package classes;

import enums.*;

public class TimeOfDay {
    private static boolean isStarted;

    public void setStatus(boolean b) {
        isStarted = b;
    }

    public static boolean getStatus() {
        return isStarted;
    }

    public static class Dusk extends TimeOfDay {
        public void start(AmountOfTime aot) {
            setStatus(true);
            System.out.printf("Сумерки сгущались %s.%n", aot.getValue());
        }
    }
}
