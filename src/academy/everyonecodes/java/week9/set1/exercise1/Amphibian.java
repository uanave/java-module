package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Amphibian extends Animal {
    private boolean hasLegs;

    public Amphibian(String name, List<String> movement, boolean hasLegs) {
        super(name, "amphibian", movement);
        this.hasLegs = hasLegs;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }
}
