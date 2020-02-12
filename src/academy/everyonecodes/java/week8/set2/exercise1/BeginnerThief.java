package academy.everyonecodes.java.week8.set2.exercise1;

public class BeginnerThief implements Thief {
    int skillLevel = 1;

    @Override
    public void open(Safe safe) {
        int points = safe.getDifficultyPoints();
        safe.setDifficultyPoints(points - skillLevel);
    }
}
