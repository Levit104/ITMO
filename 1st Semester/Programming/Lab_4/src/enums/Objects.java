package enums;

public enum Objects {
    HEAD("голову");

    private final String value;
    Objects(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
