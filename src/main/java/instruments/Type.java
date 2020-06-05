package instruments;

public enum Type {

    BRASS("brass"),
    STRING("string"),
    WOODWING("woodwind"),
    KEYBOARD("keyboard"),
    PERCUSSION("percussion");

    private final String value;


    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
