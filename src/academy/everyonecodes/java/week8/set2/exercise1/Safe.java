package academy.everyonecodes.java.week8.set2.exercise1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return securityLevel == safe.securityLevel &&
                difficultyPoints == safe.difficultyPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityLevel, difficultyPoints);
    }
}
