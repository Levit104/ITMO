package enums;

public enum People {
    SOMEONE("ему"),
    CARLSON("Карлсона"),
    POLICE("полицию");

    private final String value;
    People(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
