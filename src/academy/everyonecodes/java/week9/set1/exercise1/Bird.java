package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Bird extends Animal {
    private String featherColor;

    public Bird(String name, List<String> movement, String featherColor) {
        super(name, "bird", movement);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
