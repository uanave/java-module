package academy.everyonecodes.java.Optionals.Enums.Exercise2;

public enum Headpiece {
    WARMHEADPIECE("a Sheep's wool beanie"),
    LIGHTHEADPIECE("a New York cap");

    private String description;

    Headpiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
