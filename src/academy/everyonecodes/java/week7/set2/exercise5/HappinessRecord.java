package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Objects;

public class HappinessRecord {
    private String country;
    private int rank;
    private double score;

    public HappinessRecord(String country, int rank, double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    public String toString() {
        return "country: " + this.country + ", rank: " + this.rank + ", score: " + this.score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord that = (HappinessRecord) o;
        return rank == that.rank &&
                Double.compare(that.score, score) == 0 &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, rank, score);
    }

}
