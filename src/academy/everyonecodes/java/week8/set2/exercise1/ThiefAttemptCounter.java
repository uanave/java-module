package academy.everyonecodes.java.week8.set2.exercise1;

public class ThiefAttemptCounter {

    public int countAttempts(Thief thief, Safe safe) {
        int attempts = 0;
        while (safe.getDifficultyPoints() > 0) {
            thief.open(safe);
            attempts++;
        }
        return attempts;
    }
}
