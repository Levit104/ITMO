public enum Ideas {
    BAD("Нет, это не годится"),
    DANGEROUS("это опасно");

    private final String value;
    Ideas(String val) {
        value = val;
    }
    String getValue() {
        return value;
    }
}
