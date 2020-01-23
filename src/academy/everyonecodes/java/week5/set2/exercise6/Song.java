package academy.everyonecodes.java.week5.set2.exercise6;

public class Song {
    private String title;
    private int rank;
    private String artist;

    public Song(String title, int rank, String artist) {
        this.title = title;
        this.rank = rank;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getArtist() {
        return artist;
    }

    public String toString() {
        return "... where '" + this.title + "' is the title, " + this.rank + " is the rank and '" + this.artist + "' is the artist.";
    }
}
