package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.List;

public class TableBuilder {
    List<BuildingStep> steps = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());

    public Furniture build() {
        Furniture furniture = new Furniture("table");
        for (BuildingStep step : steps) {
            step.apply(furniture);
        }
        return furniture;
    }
}

