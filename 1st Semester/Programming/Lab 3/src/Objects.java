public enum Objects {
    HEAD("голову"),
    POLICE("полицию");

    private String value;
    Objects(String val) {
        value = val;
    }
    String getValue() {
        return value;
    }
}
