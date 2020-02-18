package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Fish extends Animal {
    private String waterKind;

    public Fish(String name, List<String> movement, String waterKind) {
        super(name, "fish", movement);
        this.waterKind = waterKind;
    }

    public String getWaterKind() {
        return waterKind;
    }
}
