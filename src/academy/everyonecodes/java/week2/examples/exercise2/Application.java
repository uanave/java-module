package academy.everyonecodes.java.week2.examples.exercise2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        TvShow sopranos = new TvShow("Sopranos", 60);
        TvShow mash = new TvShow("M.A.S.H.", 120);
        TvShow peepShow = new TvShow("Peep Show", 84);

        List<TvShow> shows = List.of(sopranos, mash, peepShow);
        for (TvShow show : shows) {
            System.out.println("The tv show " + show.getName() + " has " + show.getNumberOfEpisodes() + " episodes.");

        }

    }
}
