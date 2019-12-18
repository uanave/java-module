package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        HikeGatherer hikeGatherer = new HikeGatherer();
        Hike hike = new Hike("5 November 2020", hikeGatherer.gather());
        HikeDisplayer hikeDisplayer = new HikeDisplayer();
        hikeDisplayer.display(hike);

    }
}
