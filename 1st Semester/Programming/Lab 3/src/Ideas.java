public enum Ideas {
    BAD("Нет, это не годится"),
    DANGEROUS("это опасно");

    private String value;
    Ideas(String val) {
        value = val;
    }
    String getValue() {
        return value;
    }
}
