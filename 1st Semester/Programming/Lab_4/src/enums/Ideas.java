package enums;

public enum Ideas {
    BAD("Нет, это не годится"),
    DANGEROUS("это опасно"),
    BEST("лучше всего притаиться"),
    ALL_WORST("всех дурных советов"),
    THIS_WORST("этот самый худший");

    private final String value;
    Ideas(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
