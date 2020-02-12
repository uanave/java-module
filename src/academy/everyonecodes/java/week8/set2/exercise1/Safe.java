package academy.everyonecodes.java.week8.set2.exercise1;

public class Safe {
    private int securityLevel;
    private int difficultyPoints;

    public Safe(int securityLevel, int difficultyPoints) {
        this.securityLevel = securityLevel;
        this.difficultyPoints = difficultyPoints;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }
}
