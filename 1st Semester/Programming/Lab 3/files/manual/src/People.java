public enum People {
    SOMEONE("ему"),
    CARLSON("Карлсона"),
    BAD_GUYS("Филле и Рулле");

    private String value;
    People(String val) {
        value = val;
    }
    String getValue() {
        return value;
    }
}
