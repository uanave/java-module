package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Furniture {
    String name;
    List<String> parts;

    public Furniture(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getParts() {
        return parts;
    }
}
