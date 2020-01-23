package academy.everyonecodes.java.week5.set2.exercise4;

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
        return "country: " + this.country + " rank: " + this.rank + " score: " + this.score;
    }

}
