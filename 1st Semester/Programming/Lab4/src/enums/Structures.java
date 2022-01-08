package enums;

public enum Structures {
    MUSEUM("железнодорожный музей"),
    HOME("домой"),
    KID_ROOM("свою комнату"),
    CARLSON_HOUSE("домике на крыше");

    private final String value;
    Structures(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
