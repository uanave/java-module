package academy.everyonecodes.java.week2.examples.exercise2;

public class TvShow {
    private String name;
    private int numberOfEpisodes;

    public TvShow(String name, int numberOfEPisodes) {
        this.name = name;
        this.numberOfEpisodes = numberOfEPisodes;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}
