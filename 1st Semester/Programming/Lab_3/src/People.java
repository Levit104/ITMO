public enum People {
    SOMEONE("ему"),
    CARLSON("Карлсона"),
    POLICE("полицию");

    private final String value;
    People(String val) {
        value = val;
    }
    
    String getValue() {
        return value;
    }
}
