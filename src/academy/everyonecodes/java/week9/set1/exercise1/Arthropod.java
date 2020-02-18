package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Arthropod extends Animal {
    private int numberOfLegs;

    public Arthropod(String name, List<String> movement, int numberOfLegs) {
        super(name, "arthropod", movement);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
