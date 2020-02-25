package academy.everyonecodes.java.optionals.Enums.Exercise2;

public enum Socks {
    GREENSOCKS("green socks with stripes"),
    YELLOWSOCKS("yellow socks with stripes"),
    REDSOCKS("red socks with stripes");

    private String description;

    Socks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
