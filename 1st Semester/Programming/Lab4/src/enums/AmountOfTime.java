package enums;

public enum AmountOfTime {
    WHOLE_DAY("весь день"),
    SLOW("медленно");

    private final String value;
    AmountOfTime(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
