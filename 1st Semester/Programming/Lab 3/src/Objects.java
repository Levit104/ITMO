public enum Objects {
    HEAD("голову"),
    POLICE("полицию");

    private final String value;
    Objects(String val) {
        value = val;
    }
    String getValue() {
        return value;
    }
}
